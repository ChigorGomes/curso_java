package com.javapoo.application;

import com.javapoo.entities.Department;
import com.javapoo.entities.HourContract;
import com.javapoo.entities.Worker;
import com.javapoo.entities.enums.WorkLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramWorker {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String nameDepartment = scanner.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Level: ");
        String level = scanner.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = scanner.nextDouble();

        Department department = new Department(nameDepartment);
        WorkLevel workLevel = WorkLevel.valueOf(level);
        Worker worker = new Worker(name, workLevel, baseSalary, department);

        System.out.print("How many contracts to this worker? ");
        int nContracts = scanner.nextInt();
        for (int i = 1; i <= nContracts; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String date = scanner.next();
            Date dateAux = sdf.parse(date);
            System.out.print("Value per hour: ");
            double valueHours = scanner.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = scanner.nextInt();
            HourContract contract = new HourContract(dateAux, valueHours, hours);
            worker.addContract(contract);
        }

        scanner.nextLine();


        System.out.print("\nEnter month and tear to calculate income (MM/YY): ");
        String income = scanner.next();
        int month = Integer.parseInt(income.substring(0, 2));
        int year = Integer.parseInt(income.substring(3));

        System.out.println(worker + "Income for " + income + ": " + worker.income(year, month));

        scanner.close();
    }
}
