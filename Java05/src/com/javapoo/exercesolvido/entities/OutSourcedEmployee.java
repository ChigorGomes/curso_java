package com.javapoo.exercesolvido.entities;

public class OutSourcedEmployee extends Employee {
    private Double additionalCharge;


    public OutSourcedEmployee() {
        super();
    }

    public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }


    @Override
    public final double payment() {
        double despesa = additionalCharge * (110.0 / 100.0);
        return super.payment() + despesa;
    }

    @Override
    public String toString() {
        return name
                + " - $ "
                + String.format("%.2f", payment());
    }

}
