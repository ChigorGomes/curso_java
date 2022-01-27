package com.javapoo.excecoes.exemplo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProgramExcecao {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            System.out.println("finally Executado");
        }

    }

//    public static void method1() {
//        System.out.println("** METHOD1 START***");
//        method2();
//        System.out.println("** METHOD1 END***");
//
//
//    }
//
//    public static void method2() {
//        System.out.println("** METHOD2 START***");
//        Scanner scanner = new Scanner(System.in);
//        try {
//            String[] vet = scanner.nextLine().split(" ");
//            int position = scanner.nextInt();
//            System.out.println(vet[position]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Invalid Position");
//            e.printStackTrace();
//            scanner.next();
//        } catch (InputMismatchException e) {
//            System.out.println("Input error");
//        }
//        System.out.println("** METHOD2 END***");
//        scanner.close();
//    }
}
