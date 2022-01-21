package com.java.poo.application;

import com.java.poo.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle =  new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        System.out.println(rectangle);
        scanner.close();
    }
}
