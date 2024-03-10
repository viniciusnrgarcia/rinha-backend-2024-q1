package br.com.vnrg.rinhabackend2024q1.controller;

import br.com.vnrg.rinhabackend2024q1.model.ReportResponse;
import br.com.vnrg.rinhabackend2024q1.model.TransactionRequest;
import br.com.vnrg.rinhabackend2024q1.model.TransactionResponse;
import br.com.vnrg.rinhabackend2024q1.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @PostMapping(path = "clientes/{id}/transacoes")
    ResponseEntity<TransactionResponse> create(@PathVariable(name = "id") Integer id,
                                               @Valid @RequestBody TransactionRequest request) {
        return ResponseEntity.ok(this.service.create(id, request));
    }

    @GetMapping(path = "clientes/{id}/extrato")
    ResponseEntity<ReportResponse> create(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok(this.service.report(id));
    }

}
