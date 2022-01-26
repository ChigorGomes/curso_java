package com.javapoo.exemplo.heranca.entities;

public class SavingsAccount extends Account { //evita de a classe ser herdada por outra classe
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }


    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override //evita que o metodo seja sobreposto por outra classe
    public  void withdraw(double amount) {
        balance -= amount;
    }


}
