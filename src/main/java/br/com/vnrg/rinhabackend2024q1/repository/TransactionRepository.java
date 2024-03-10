package br.com.vnrg.rinhabackend2024q1.repository;

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

    public int save(int customerId, int limitAccount, String typeTransaction, int transactionValue, String description) {
        return this.jdbcClient.sql("""
                with transaction_customer as (
                							select coalesce(sum(total_value), 0) as balance
                								from transactions t
                								where t.id = :id
                								)
                 insert into transactions (id, "type", description, total_value, created_at)
                 select :id as id,
                 		:type_param as "type",
                 		:description as description,
                 		:transaction_value as total_value,
                 		now() as created_at
                   from transaction_customer
                   where (transaction_customer.balance + :transaction_value) >= :limit_customer
                """)
                .param("id", customerId)
                .param("type_param", typeTransaction)
                .param("description", description)
                .param("transaction_value", transactionValue)
                .param("limit_customer", limitAccount)
                .update();
    }

    @Transactional
    public List<TransactionEntity> list(int id) {
        return this.jdbcClient.sql("""
                select
                	t.id, t.type, t.description, abs(t.total_value) as total_value, t.created_at,
                	sum(t.total_value) over (partition by t.id) as total
                 from transactions t
                where t.id = ?
                order by t.created_at desc limit 10 offset 0
                """)
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
        return this.jdbcClient.sql("""
                    select sum(total_value)
                    from transactions t
                    where t.id = ?
                """)
                .param(id)
                .query(Integer.class)
                .single();
    }
}
