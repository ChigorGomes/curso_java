package com.javapoo.program;

import com.javapoo.model.entities.Account;
import com.javapoo.model.exception.DomainException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Holder: ");
            String holder = scanner.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = scanner.nextDouble();
            System.out.print("Withdraw limit: ");
            double withDrawLimit = scanner.nextDouble();

            Account account = new Account(number, holder, initialBalance, withDrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            double withDraw = scanner.nextDouble();
            account.withDraw(withDraw);
            System.out.println(account);
        } catch (DomainException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}
