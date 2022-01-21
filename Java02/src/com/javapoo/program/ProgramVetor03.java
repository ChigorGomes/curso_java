package com.javapoo.program;

import com.javapoo.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVetor03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rent[] rents = new Rent[10];
        System.out.print("How many rooms will be rented? ");
        int tamanho = scanner.nextInt();
        for (int i = 0; i < tamanho; i++) {
            scanner.nextLine();
            System.out.println("\nRent #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int room = scanner.nextInt();
            rents[room] = new Rent(name, email);
        }

        System.out.println("\nBusy rooms: ");
        for (int i = 0; i < rents.length; i++) {
            if (rents[i] != null)
                System.out.println(i + ": " + rents[i].getName() + ", " + rents[i].getEmail());
        }

        scanner.close();
    }
}
