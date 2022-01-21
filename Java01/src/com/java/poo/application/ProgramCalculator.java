package com.java.poo.application;

import com.java.poo.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCalculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        double c = Calculator.circuferencia(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circuferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", Calculator.PI);

        scanner.close();


    }
}
