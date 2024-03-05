package br.com.vnrg.rinhabackend2024q1.service;

import br.com.vnrg.rinhabackend2024q1.controller.TransactionRequest;
import br.com.vnrg.rinhabackend2024q1.exceptions.BalanceNotAvailableException;
import br.com.vnrg.rinhabackend2024q1.exceptions.CustomerNotFoundException;
import br.com.vnrg.rinhabackend2024q1.repository.CustomerEntity;
import br.com.vnrg.rinhabackend2024q1.repository.CustomerRepository;
import br.com.vnrg.rinhabackend2024q1.repository.TransactionEntity;
import br.com.vnrg.rinhabackend2024q1.repository.TransactionRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository repository;
    private final CustomerRepository customerRepository;

    public TransactionService(TransactionRepository repository, CustomerRepository customerRepository) {
        this.repository = repository;
        this.customerRepository = customerRepository;
    }

    // @Transactional
    @Cacheable
    public CustomerEntity getCustomer(int id) {
        var customer = this.customerRepository.find(id);
        if (customer == null) {
            throw new CustomerNotFoundException("customer not found");
        }
        return customer;
    }

    // @Transactional
    public int create(CustomerEntity customer, final TransactionRequest request)  {
        int rowAffected = this.repository.save(customer.getId(), customer.getLimitAccount(),
                request.tipo(), request.getTransactionValue(), request.descricao());
        if (rowAffected > 0) {
            return this.repository.getBalance(customer.getId());
        }
        throw new BalanceNotAvailableException("balance not available");
    }

    public List<TransactionEntity> report(CustomerEntity customer) {
         return this.repository.list(customer.getId());
    }
}
