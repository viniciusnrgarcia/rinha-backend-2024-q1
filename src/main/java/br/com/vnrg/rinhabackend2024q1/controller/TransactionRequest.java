package br.com.vnrg.rinhabackend2024q1.controller;

import jakarta.validation.constraints.*;

public record TransactionRequest(
        @NotNull @Positive(message = "valor deve ser um número inteiro positivo que representa centavos (não vamos trabalhar com frações de centavos). Por exemplo, R$ 10 são 1000 centavos") int valor,
        @NotBlank @Pattern(regexp = "c|d", message = "tipo deve ser apenas c para crédito ou d para débito") String tipo,
        @NotBlank @Size(min = 1, max = 10, message = "descricao deve ser uma string de 1 a 10 caracteres") String descricao) {

    public int getTransactionValue() {
        return this.tipo().equalsIgnoreCase("d") ? this.valor() * -1 : this.valor();
    }

}
