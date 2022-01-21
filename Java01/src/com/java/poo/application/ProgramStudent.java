package com.java.poo.application;

import com.java.poo.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner =  new Scanner(System.in);
        Student student = new Student();
        student.name = scanner.nextLine();
        student.note1 = scanner.nextDouble();
        student.note2 = scanner.nextDouble();
        student.note3 = scanner.nextDouble();

        System.out.println(student);

        scanner.close();

    }
}
