package com.javapoo.program;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMatriz01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] matriz = new int[N][N];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int valor = scanner.nextInt();
                matriz[i][j] = valor;
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        int contNegativo = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0)
                    contNegativo++;
            }
        }

        System.out.print("\nNegative numbers = " + contNegativo);

        scanner.close();
    }
}
