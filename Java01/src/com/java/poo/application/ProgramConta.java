package com.java.poo.application;

import com.java.poo.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class ProgramConta {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Conta conta = null;

        System.out.print("Enter account number: ");
        String numeroConta = scanner.nextLine();
        System.out.print("Enter account holder: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Is there na initial deposit (y/n) ?");
        char opcao = scanner.next().charAt(0);

        switch (opcao) {
            case 'y':
                System.out.print("Enter initial deposit value: ");
                double depositoInicial = scanner.nextDouble();
                conta = new Conta(numeroConta, nomeCliente, depositoInicial);
                break;
            case 'n':
                conta = new Conta(numeroConta, nomeCliente);
                break;
            default:
                System.out.println("Invalid opcion!");
        }
        System.out.println("Account data:");
        System.out.println(conta);

        System.out.print("Enter a deposit value: ");
        double valorDepositado = scanner.nextDouble();
        conta.depositoConta(valorDepositado);
        System.out.print("Updated account data: ");
        System.out.println(conta);


        System.out.print("Enter a withdraw value: ");
        double valorSaque = scanner.nextDouble();
        conta.saqueConta(valorSaque);
        System.out.print("Updated account data: ");
        System.out.println(conta);

        scanner.close();
    }
}
