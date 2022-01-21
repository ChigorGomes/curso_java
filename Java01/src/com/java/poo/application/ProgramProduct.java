package com.java.poo.application;

import com.java.poo.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        Product product = new Product(name,price);

//        System.out.print("Quantity in Stock: ");
//        product.setQuantity(scanner.nextInt());

        System.out.println("Product data: " + product);


        System.out.print("\nEnter the number of products to be add in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);


        System.out.print("\nEnter the number of products to be removed from stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);

        scanner.close();

    }
}
