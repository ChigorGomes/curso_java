package com.javapoo.program;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMatriz02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int linha = scanner.nextInt();
        int coluna = scanner.nextInt();
        int[][] matriz = new int[linha][coluna];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int valor = scanner.nextInt();
                matriz[i][j] = valor;
            }
        }
        int numeroProcurado = scanner.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numeroProcurado) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0)
                        System.out.println("Left: " + matriz[i][j - 1]);
                    if (j < matriz[i].length - 1)
                        System.out.println("Right: " + matriz[i][j + 1]);
                    if (i > 0)
                        System.out.println("Up: " + matriz[i - 1][j]);
                    if (i < matriz.length - 1)
                        System.out.println("Down: " + matriz[i + 1][j]);
                }
            }
        }


        scanner.close();
    }
}
