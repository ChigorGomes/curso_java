package com.java.poo.application;

import com.java.poo.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ProgramConvert {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner= new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        double precoDollar = scanner.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantidadeDollar = scanner.nextDouble();
        double dollars = CurrencyConverter.converte(precoDollar,quantidadeDollar);
        System.out.printf("Amount to be paid in reais = %.2f%n", dollars);

    }
}
