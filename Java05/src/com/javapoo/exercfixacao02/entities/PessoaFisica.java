package com.javapoo.exercfixacao02.entities;

public final class PessoaFisica extends Contribuintes {
    private double gastoSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaMensal, double gastoSaude) {
        super(nome, rendaMensal);
        this.gastoSaude = gastoSaude;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }


    @Override
    public double calcImposto() {
        double renda = getRendaMensal();
        if (renda < 2000.0) {
            return (renda * (15.0 / 100)) - (gastoSaude * (50.0 / 100));
        } else {
            return (renda * (25.0 / 100)) - (gastoSaude * (50.0 / 100));
        }
    }
}
