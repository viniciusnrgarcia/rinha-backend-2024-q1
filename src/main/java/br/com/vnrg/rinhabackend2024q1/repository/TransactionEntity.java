package br.com.vnrg.rinhabackend2024q1.repository;


import java.time.LocalDateTime;

public record TransactionEntity(int id, String type, String description, int totalValue, LocalDateTime createdAt) {
}


