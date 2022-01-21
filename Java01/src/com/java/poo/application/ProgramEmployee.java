package com.java.poo.application;

import com.java.poo.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner =  new Scanner(System.in);
        Employee employee =  new Employee();
        System.out.print("Name: ");
        employee.name = scanner.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();
        System.out.println("Employee: " +employee);
        System.out.print("Which percentage to increase salary? ");
        double percentage;
        percentage = scanner.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Updated data: " +employee );

        scanner.close();

    }
}
