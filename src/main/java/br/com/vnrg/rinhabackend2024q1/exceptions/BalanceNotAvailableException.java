package br.com.vnrg.rinhabackend2024q1.exceptions;

public class BalanceNotAvailableException extends RuntimeException {

    public BalanceNotAvailableException() {
        super();
    }

    public BalanceNotAvailableException(String message) {
        super(message);
    }
}
