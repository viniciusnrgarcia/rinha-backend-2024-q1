package br.com.vnrg.rinhabackend2024q1.controller;


import java.time.LocalDateTime;

record TransactionsResponse(int valor, String tipo, String descricao, LocalDateTime realizada_em) {
}
