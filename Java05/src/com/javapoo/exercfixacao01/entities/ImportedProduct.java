package com.javapoo.exercfixacao01.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFree) {
        super(name, price);
        this.customsFee = customsFree;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public final double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public final String toString() {
        return getName() + " $" + String.format("%.2f", totalPrice())
                + "( Customs fee: $ " + String.format("%.2f", customsFee) + ")";
    }
}
