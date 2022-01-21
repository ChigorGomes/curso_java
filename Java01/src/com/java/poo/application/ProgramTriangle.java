package com.java.poo.application;

import com.java.poo.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTriangle {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x = new Triangle();
        Triangle y = new Triangle();
        double areaX, areaY;

        System.out.println("Enter the measures of triangle X: ");
        x.setA(sc.nextDouble());
        x.setB(sc.nextDouble());
        x.setC(sc.nextDouble());

        System.out.println("Enter the measures of triangle Y: ");
        y.setA(sc.nextDouble());
        y.setB(sc.nextDouble());
        y.setC(sc.nextDouble());

        areaX = x.calculaArea();
        areaY = y.calculaArea();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) System.out.println("Larger area X");
        else System.out.println("Larger area Y");


        sc.close();
    }
}
