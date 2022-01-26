package com.javapoo.exercfixacao02.entities;

public final class PessoaJuridica extends Contribuintes {
    private Integer numeroFuncionario;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaMensal, Integer numeroFuncionario) {
        super(nome, rendaMensal);
        this.numeroFuncionario = numeroFuncionario;
    }

    public Integer getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(Integer numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    @Override
    public double calcImposto() {
        double renda = getRendaMensal();
        if (numeroFuncionario < 10) {
            return renda * (16.0 / 100);
        } else {
            return renda * (14.0 / 100);

        }
    }
}
