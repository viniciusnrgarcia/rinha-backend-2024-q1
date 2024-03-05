package br.com.vnrg.rinhabackend2024q1.controller;

import br.com.vnrg.rinhabackend2024q1.exceptions.CustomerNotFoundException;
import br.com.vnrg.rinhabackend2024q1.repository.CustomerEntity;
import br.com.vnrg.rinhabackend2024q1.repository.TransactionEntity;
import br.com.vnrg.rinhabackend2024q1.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @PostMapping(path = "clientes/{id}/transacoes")
    ResponseEntity<TransactionResponse> create(@PathVariable(name = "id") Integer id,
                                               @Valid @RequestBody TransactionRequest request) {
        var customer = this.getCustomer(id);
        return ResponseEntity.ok(
                new TransactionResponse(customer.getPositiveLimitAccount(),
                        this.service.create(customer, request)));
    }

    @GetMapping(path = "clientes/{id}/extrato")
    ResponseEntity<ReportResponse> create(@PathVariable(name = "id") Integer id) {
        var customer = this.getCustomer(id);
        var transactions = this.service.report(customer);

        var total = 0;
        List<TransactionsResponse> ultimas_transacoes = new ArrayList<>();
        for (TransactionEntity t : transactions) {
            ultimas_transacoes.add(
                    new TransactionsResponse(t.totalValue(),
                            t.type(),
                            t.description(),
                            t.createdAt())
            );
            total = t.total();
        }

        return ResponseEntity.ok(
                new ReportResponse(
                        new BalanceResponse(total, LocalDateTime.now(),
                                customer.getPositiveLimitAccount()),
                        ultimas_transacoes)
                );
    }

    private CustomerEntity getCustomer(Integer id) {
        return this.service.getCustomer(id);
    }

}
