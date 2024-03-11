package br.com.vnrg.rinhabackend2024q1.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class CustomerRepository {

    private final JdbcClient jdbcClient;

    public CustomerRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    @Cacheable("customers.get")
    public CustomerEntity find(int id) {
        return this.findAll().get(id);
    }

    @Cacheable("customers.findAll")
    private ConcurrentHashMap<Integer, CustomerEntity> findAll() {
        List<CustomerEntity> result = this.jdbcClient.sql("""
                select c.id, c.limit_account , c.balance  from customers c
                """).query(
                (rs, rowNum) -> new CustomerEntity(
                        rs.getInt("id"),
                        rs.getInt("limit_account"),
                        rs.getInt("balance"))
        ).list();
        var map = new ConcurrentHashMap<Integer, CustomerEntity>(5);
        result.forEach(c -> map.put(c.getId(), c));
        return map;
    }
}
