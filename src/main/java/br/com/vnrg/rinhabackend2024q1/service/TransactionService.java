package br.com.vnrg.rinhabackend2024q1.service;

import br.com.vnrg.rinhabackend2024q1.exceptions.BalanceNotAvailableException;
import br.com.vnrg.rinhabackend2024q1.exceptions.CustomerNotFoundException;
import br.com.vnrg.rinhabackend2024q1.model.*;
import br.com.vnrg.rinhabackend2024q1.repository.CustomerEntity;
import br.com.vnrg.rinhabackend2024q1.repository.CustomerRepository;
import br.com.vnrg.rinhabackend2024q1.repository.TransactionEntity;
import br.com.vnrg.rinhabackend2024q1.repository.TransactionRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository repository;
    private final CustomerRepository customerRepository;

    public TransactionService(TransactionRepository repository, CustomerRepository customerRepository) {
        this.repository = repository;
        this.customerRepository = customerRepository;
    }

    @Cacheable("customers")
    public CustomerEntity getCustomer(int id) {
        var customer = this.customerRepository.find(id);
        if (customer == null) {
            throw new CustomerNotFoundException("customer not found");
        }
        return customer;
    }

    @Transactional
    public TransactionResponse create(int customerId, final TransactionRequest request) {
        var customer = this.getCustomer(customerId);
        int rowAffected = this.repository.save(customer.getId(), customer.getLimitAccount(),
                request.tipo(), request.getTransactionValue(), request.descricao());
        if (rowAffected > 0) {
            return new TransactionResponse(customer.getPositiveLimitAccount(), this.repository.getBalance(customer.getId()));
        }
        throw new BalanceNotAvailableException("balance not available");
    }

    public ReportResponse report(Integer customerId) {
        var customer = this.getCustomer(customerId);
        var result = this.repository.list(customerId);

        List<TransactionsResponse> ultimas_transacoes = new ArrayList<>();
        var total = 0;
        for (TransactionEntity t : result) {
            ultimas_transacoes.add(
                    new TransactionsResponse(t.totalValue(),
                            t.type(),
                            t.description(),
                            t.createdAt())
            );
            total = t.total();
        }

        return new ReportResponse(
                new BalanceResponse(total, LocalDateTime.now(), customer.getPositiveLimitAccount()),
                ultimas_transacoes);
    }


}
