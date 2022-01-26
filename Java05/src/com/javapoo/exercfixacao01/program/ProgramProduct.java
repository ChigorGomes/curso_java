package com.javapoo.exercfixacao01.program;

import com.javapoo.exercfixacao01.entities.ImportedProduct;
import com.javapoo.exercfixacao01.entities.Product;
import com.javapoo.exercfixacao01.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProgramProduct {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> productList = new ArrayList<>();
        Product product = null;

        System.out.print("Enter the number of products: ");
        int nProduct = scanner.nextInt();
        scanner.nextLine();
        int i = 1;
        while (i <= nProduct) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char opc = scanner.next().toLowerCase(Locale.ROOT).charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String nameProduct = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();

            switch (opc) {
                case 'i':
                    System.out.print("Custom fee: ");
                    double customFee = scanner.nextDouble();
                    product = new ImportedProduct(nameProduct, price, customFee);
                    productList.add(product);
                    i++;
                    break;
                case 'c':
                    product = new Product(nameProduct, price);
                    productList.add(product);
                    i++;
                    break;
                case 'u':
                    scanner.nextLine();
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String dateAux = scanner.nextLine();
                    Date date = sdf.parse(dateAux);
                    product = new UsedProduct(nameProduct, price, date);
                    productList.add(product);
                    i++;
                    break;
                default:
                    System.out.println("invalid opcion!");
                    break;

            }

        }

        System.out.println("\nPRICE TAGS:");
        productList.forEach(System.out::println);

        scanner.close();
    }
}
