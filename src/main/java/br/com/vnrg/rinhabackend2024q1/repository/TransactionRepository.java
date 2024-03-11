package br.com.vnrg.rinhabackend2024q1.repository;

import br.com.vnrg.rinhabackend2024q1.exceptions.BalanceNotAvailableException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TransactionRepository {

    private final JdbcClient jdbcClient;

    public TransactionRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }


    @Transactional
    public void saveDebit(int customerId, int limitAccount, String typeTransaction, int transactionValue, String description) {
        var rowAffected = this.jdbcClient.sql(String.format("""
                        with transaction_customer as (
                        							select coalesce(sum(total_value), 0) as balance
                        								from transactions_%1$s t
                        								where t.id = :id
                        								)
                         insert into transactions_%1$s  (id, "type", description, total_value, created_at)
                         select :id as id,
                         		:type_param as "type",
                         		:description as description,
                         		:transaction_value as total_value,
                         		now() as created_at
                           from transaction_customer
                           where (transaction_customer.balance + :transaction_value) >= :limit_customer
                        """, customerId))
                .param("id", customerId)
                .param("type_param", typeTransaction)
                .param("description", description)
                .param("transaction_value", transactionValue)
                .param("limit_customer", limitAccount)
                .update();
        if (rowAffected == 0) {
            throw new BalanceNotAvailableException("balance not available");
        }
    }


    @Transactional
    public void saveCredit(int customerId, String typeTransaction, int transactionValue, String description) {
        this.jdbcClient.sql(String.format("""
                         insert into transactions_%1$s  (id, "type", description, total_value, created_at)
                         values(:id,
                         		:type_param,
                         		:description,
                         		:transaction_value,
                         		now())
                        """, customerId))
                .param("id", customerId)
                .param("type_param", typeTransaction)
                .param("description", description)
                .param("transaction_value", transactionValue)
                .update();
    }


    @Transactional
    public List<TransactionEntity> list(int id) {
        return this.jdbcClient.sql(String.format("""
                        select
                        	t.id, t.type, t.description, abs(t.total_value) as total_value, t.created_at,
                        	sum(t.total_value) over (partition by t.id) as total
                         from transactions_%1$s t
                        where t.id = ?
                        order by t.created_at desc limit 10 offset 0
                        """, id))
                .param(id)
                .query(
                        //TransactionEntity.class
                        (rs, rowNum) -> new TransactionEntity(
                                rs.getInt("id"),
                                rs.getString("type"),
                                rs.getString("description"),
                                rs.getInt("total_value"),
                                rs.getTimestamp("created_at").toLocalDateTime(),
                                rs.getInt("total")
                        )
                )
                .list();
    }

    public int getBalance(int id) {
        return this.jdbcClient.sql(String.format("""
                            select sum(total_value)
                            from transactions_%1$s t
                            where t.id = ?
                        """, id))
                .param(id)
                .query(Integer.class)
                .single();
    }
}
