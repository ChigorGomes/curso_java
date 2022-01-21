package com.java.poo.entities;

public class Conta {
    private String numeroConta;
    private String nomeTitular;
    private double saldo;


    public Conta(String numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        depositoConta(depositoInicial);
    }

    public Conta(String numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositoConta(double deposito){
        saldo += deposito;
    }

    public  void saqueConta(double saque){
        saldo -= saque + 5.0;
    }

    @Override
    public String toString() {
        return "Account "
                + numeroConta
                +" , Holder: "
                + nomeTitular
                +" , Balance: $ "
                + String.format("%.2f",saldo);
    }
}
