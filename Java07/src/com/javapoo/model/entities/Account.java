package com.javapoo.model.entities;

import com.javapoo.model.exception.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimite;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withDrawLimite) {
        if (balance < 0.0) {
            throw new DomainException(("Deposito não pode ser negativo!"));
        }
        if (withDrawLimite < 0.0) {
            throw new DomainException("Limite de saque não pode ser negativo!");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimite = withDrawLimite;
    }

    public Integer getNumber() {
        return number;
    }


    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }


    public Double getWithDrawLimite() {
        return withDrawLimite;
    }

    public void deposit(Double amount) {
        if (amount > 0.0) {
            balance += amount;
        } else throw new DomainException("Deposito tem que ser maior que zero reais!");
    }

    public void withDraw(Double amount) {
        validatewithDraw(amount);
        balance -= amount;
    }

    private void validatewithDraw(double amount) {
        if (amount <= 0.0) {
            throw new DomainException("Saque tem que ser maior que zero reais!");
        }
        if (amount > withDrawLimite) {
            throw new DomainException("Erro de saque: A quantia excede o limite de saque");
        }
        if (amount > balance) {
            throw new DomainException("Saque insuficiente!");
        }
    }

    @Override
    public String toString() {
        return "New Balance: " + balance;
    }
}
