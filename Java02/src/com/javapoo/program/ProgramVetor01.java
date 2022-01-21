package com.javapoo.program;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVetor01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        double[] vect = new double[tamanho];
        double soma = 0.0;

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite a altura do vetor na posicao [" + i + "]: ");
            double altura = scanner.nextDouble();
            vect[i] = altura;
        }

        for (double index : vect) {
            soma += index;
        }
        double media = soma / tamanho;
        System.out.println("\nAVERAGE HEIGHT= " + String.format("%.2f ", media));

        scanner.close();
    }
}
