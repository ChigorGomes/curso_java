package com.javapoo.program;

import com.javapoo.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int tamanho = scanner.nextInt();
        int i = 1;
        while (i <= tamanho) {
            System.out.println("\nEmployee #" + i + ":");
            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            if (employeeList.stream().allMatch(x -> x.getId() != id)) {
                scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Salary: ");
                Double salary = scanner.nextDouble();
                employeeList.add(new Employee(id, name, salary));
                i++;
            } else System.out.println("Id já existe");

        }

        System.out.print("\nEnter the employee id that will be have salary increase : ");
        int id = scanner.nextInt();
        Employee employee = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (employee != null) {
            System.out.print("Enter the percentage: ");
            double porcentagem = scanner.nextDouble();
            employee.aumentoSalario(porcentagem);

        } else System.out.println("This id does not exist! ");


        System.out.println("\nList of employees: ");
        employeeList.forEach(employ -> System.out.println(employ));

        scanner.close();
    }
}
