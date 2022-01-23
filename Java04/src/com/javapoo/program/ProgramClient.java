package com.javapoo.program;

import com.javapoo.entities.Client;
import com.javapoo.entities.Order;
import com.javapoo.entities.OrderItem;
import com.javapoo.entities.Product;
import com.javapoo.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramClient {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String clientName = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        String birthDate = scanner.nextLine();
        Date date = sdf.parse(birthDate);
        Client client = new Client(clientName, email, date);

        System.out.println("Enter order data: ");
        System.out.print("Status ");
        String status = scanner.nextLine();
        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int nOrder = scanner.nextInt();

        for (int i = 1; i <= nOrder; i++) {
            scanner.nextLine();
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = scanner.next();
            System.out.print("Product price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            Product product = new Product(productName, price);
            OrderItem item = new OrderItem(quantity, price, product);
            order.addItem(item);
        }

        System.out.println(order);


        scanner.close();
    }
}
