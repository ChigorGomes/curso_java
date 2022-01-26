package com.javapoo.exemplo.abstrato.metodos.program;

import com.javapoo.exemplo.abstrato.metodos.entities.Circle;
import com.javapoo.exemplo.abstrato.metodos.entities.Color;
import com.javapoo.exemplo.abstrato.metodos.entities.Rectangle;
import com.javapoo.exemplo.abstrato.metodos.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramShape {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Shape> shapeList = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int nShapes = scanner.nextInt();

        for (int i = 1; i <= nShapes; i++) {
            System.out.print("Shape #" + i + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char opcShapes = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            String opcColor = scanner.nextLine();
            Color color = Color.valueOf(opcColor);
            switch (opcShapes) {
                case 'r' -> {
                    System.out.print("Width: ");
                    double width = scanner.nextDouble();
                    System.out.print("Height: ");
                    double height = scanner.nextDouble();
                    shapeList.add(new Rectangle(color, width, height));
                }
                case 'c' -> {
                    System.out.print("Radius: ");
                    double radius = scanner.nextDouble();
                    shapeList.add(new Circle(color, radius));
                }
                default -> {
                    i--;
                    System.out.println("Invalid");
                }
            }
        }

        System.out.println("\nSHAPE AREAS:");
        shapeList.forEach(shape -> System.out.printf("%.2f%n", shape.area()));

        scanner.close();
    }
}
