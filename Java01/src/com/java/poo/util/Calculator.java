package com.java.poo.util;

public class Calculator {

    //metodo estatico podem ser calculado independente do objeto
    public static final double PI = 3.14159;

    public static double circuferencia(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return (4.0 * PI * Math.pow(radius, 3.0)) / 3.0;
    }


}
