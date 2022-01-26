package com.javapoo.exemplo.abstrato.classe.entities;

import com.javapoo.exemplo.abstrato.classe.entities.Account;

public class BusinessAccount extends Account {
    private Double loanLimite;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimite) {
        super(number, holder, balance); //chama o construtor da superclasse, ou seja Account
        this.loanLimite = loanLimite;
    }

    public Double getLoanLimite() {
        return loanLimite;
    }

    public void setLoanLimite(Double loanLimite) {
        this.loanLimite = loanLimite;
    }

    public void loan(double amount) {
        if (amount <= loanLimite)
            balance += amount - 10.0;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
