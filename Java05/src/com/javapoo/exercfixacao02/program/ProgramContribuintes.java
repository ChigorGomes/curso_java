package com.javapoo.exercfixacao02.program;

import com.javapoo.exercfixacao02.entities.Contribuintes;
import com.javapoo.exercfixacao02.entities.PessoaFisica;
import com.javapoo.exercfixacao02.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramContribuintes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Contribuintes> contribuintesList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int nContribuintes = scanner.nextInt();

        for (int i = 1; i <= nContribuintes; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char opc = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String nome = scanner.nextLine();
            System.out.print("Anual income: ");
            double rendaMensal = scanner.nextDouble();

            switch (opc) {
                case 'i' -> {
                    System.out.print("Health expeditures: ");
                    double gastoSaude = scanner.nextDouble();
                    contribuintesList.add(new PessoaFisica(nome, rendaMensal, gastoSaude));
                }
                case 'c' -> {
                    System.out.print("Number of employees: ");
                    int nFuncionarios = scanner.nextInt();
                    contribuintesList.add(new PessoaJuridica(nome, rendaMensal, nFuncionarios));
                }
                default -> {
                    System.out.print("invalid!");
                    i--;
                }

            }

        }

        System.out.println("\nTAXES PAID:");
        contribuintesList.forEach(contribuinte -> System.out.println(contribuinte.getNome()
                + " $ " + String.format("%.2f", contribuinte.calcImposto())));

        double somaContribuicao = contribuintesList.stream().mapToDouble(Contribuintes::calcImposto).sum();

        System.out.printf("\nTOTAL TAXES: $ %.2f%n", somaContribuicao);


        scanner.close();
    }
}
