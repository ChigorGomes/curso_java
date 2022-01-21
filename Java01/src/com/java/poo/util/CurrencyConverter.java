package com.java.poo.util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double converte(double precoDolar, double valorComprado) {
        return (precoDolar * valorComprado) + (precoDolar * valorComprado * IOF);
    }
}
