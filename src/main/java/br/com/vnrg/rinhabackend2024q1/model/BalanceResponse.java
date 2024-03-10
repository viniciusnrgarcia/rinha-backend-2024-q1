package br.com.vnrg.rinhabackend2024q1.model;

import java.time.LocalDateTime;

public record BalanceResponse(int total, LocalDateTime data_extrato, int limite) {
}