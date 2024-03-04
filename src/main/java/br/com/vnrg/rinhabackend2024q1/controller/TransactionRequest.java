package br.com.vnrg.rinhabackend2024q1.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record TransactionRequest(
        // @NotNull
        // @Positive(message = "valor deve ser um número inteiro positivo que representa centavos (não vamos trabalhar com frações de centavos). Por exemplo, R$ 10 são 1000 centavos")
        @NotBlank @Size(min = 1, max = 10, message = "valor deve ser uma string de 1 a 10 caracteres")
        @Pattern(regexp = "^[1-9]\\d*$", message = "valor deve ser um número inteiro positivo que representa centavos (não vamos trabalhar com frações de centavos). Por exemplo, R$ 10 são 1000 centavos")
        String valor,
        @NotBlank @Pattern(regexp = "c|d", message = "tipo deve ser apenas c para crédito ou d para débito") String tipo,
        @NotBlank @Size(min = 1, max = 10, message = "descricao deve ser uma string de 1 a 10 caracteres") String descricao) {

    public int getTransactionValue() {
        return this.tipo().equalsIgnoreCase("d") ? Integer.parseInt(this.valor()) * -1 : Integer.parseInt(this.valor());
    }

}
