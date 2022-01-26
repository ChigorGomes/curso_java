package com.javapoo.exercfixacao02.entities;

public abstract class Contribuintes {
    private String nome;
    private Double rendaMensal;

    public Contribuintes() {
    }

    public Contribuintes(String nome, Double rendaMensal) {
        this.nome = nome;
        this.rendaMensal = rendaMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(Double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public abstract double calcImposto();
}
