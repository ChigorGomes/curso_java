package com.javapoo.program;

import com.javapoo.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVetor02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int tamanho = scanner.nextInt();
        Product[] products = new Product[tamanho];

        for (int i = 0; i < products.length; i++) {
            scanner.nextLine();
            String name = scanner.nextLine();
            double preco = scanner.nextDouble();
            products[i] = new Product(name, preco);
        }

        double soma = 0.0;

        for (int i = 0; i < products.length; i++) {
            soma += products[i].getPreco();
        }

        double media = soma / products.length;
        System.out.printf("\nAVERAGE PRICE = %.2f%n", media);

        scanner.close();
    }
}
