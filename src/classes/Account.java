package classes;

import exceptions.AccountExceptions;

public class Account {

    private Integer number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    public String toString() {
        return "Novo valor: " + balance;
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            throw new AccountExceptions("O valor de deposito deve ser maior que zero!");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(amount > withdrawLimit) {
            throw new AccountExceptions("Erro de saque: O valor solicitado é maior que o limite de saque da conta!");
        }
        if(amount < balance) {
            throw new AccountExceptions("Erro de saque: Valor insuficiente para saque!");
        }
        this.balance -= amount;
    }
}
