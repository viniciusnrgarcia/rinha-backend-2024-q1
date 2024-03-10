package br.com.vnrg.rinhabackend2024q1.model;


import java.util.List;

public record ReportResponse(
        BalanceResponse saldo,
        List<TransactionsResponse> ultimas_transacoes
) {
}

