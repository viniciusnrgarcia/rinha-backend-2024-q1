package br.com.vnrg.rinhabackend2024q1.model;


import java.time.LocalDateTime;

public record TransactionsResponse(int valor, String tipo, String descricao, LocalDateTime realizada_em) {
}
