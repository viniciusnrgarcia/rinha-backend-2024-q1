package br.com.vnrg.rinhabackend2024q1.repository;

/**
 * limite deve ser o limite cadastrado do cliente.
 * saldo deve ser o novo saldo após a conclusão da transação.
 */
public class CustomerEntity {
    Integer id;
    int limitAccount;
    int balance;

    public CustomerEntity() {
        // default
    }

    public CustomerEntity(Integer id, int limitAccount, int balance) {
        this.id = id;
        this.limitAccount = limitAccount;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getLimitAccount() {
        return limitAccount;
    }

    public void setLimitAccount(int limitAccount) {
        this.limitAccount = limitAccount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPositiveLimitAccount() {
        return this.limitAccount * -1;
    }
}
