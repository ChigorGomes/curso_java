package com.javapoo.exercesolvido.program;

import com.javapoo.exercesolvido.entities.Employee;
import com.javapoo.exercesolvido.entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Employee employee = null;
        List<Employee> employeeList = new ArrayList<>();
        int i = 1;

        System.out.print("Enter the number of employee: ");
        int nEmployees = scanner.nextInt();
        while (i <= nEmployees) {
            System.out.println("Employee #" + i + " data:");

            System.out.print("Outsourced (y/n)? ");
            char opc = scanner.next().toLowerCase(Locale.ROOT).charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHours = scanner.nextDouble();

            switch (opc) {
                case 'n':
                    employee = new Employee(name, hours, valuePerHours);
                    employeeList.add(employee);
                    i++;
                    break;
                case 'y':
                    System.out.print("Additional Charge: ");
                    double additionalCharge = scanner.nextDouble();
                    employee = new OutSourcedEmployee(name, hours, valuePerHours, additionalCharge); //polimorfismo
                    employeeList.add(employee);
                    i++;
                    break;
                default:
                    System.out.println("invalid opcion!");
                    break;
            }

        }

        System.out.println("\nPAYMENTS:");
        employeeList.forEach(System.out::println);
        scanner.close();
    }
}
