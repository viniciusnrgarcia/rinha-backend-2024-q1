package br.com.vnrg.rinhabackend2024q1.controller;

import java.time.LocalDateTime;

record BalanceResponse(int total, LocalDateTime data_extrato, int limite) {
}