package com.javapoo.exemplo.abstrato.classe.program;

import com.javapoo.exemplo.abstrato.classe.entities.Account;
import com.javapoo.exemplo.abstrato.classe.entities.BusinessAccount;
import com.javapoo.exemplo.abstrato.classe.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramAccount {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 5000.0, 0.01));
        list.add(new SavingsAccount(1002, "Maria", 1000.0, 0.01));
        list.add(new BusinessAccount(1003, "Bob", 400.0, 500.0));
        list.add(new BusinessAccount(1004, "Maggie", 1000.0, 400.0));

        double soma = list.stream().mapToDouble(cc -> cc.getBalance()).sum();
        System.out.printf("%.2f%n", soma);

        list.forEach(cc -> cc.deposit(10));
        list.forEach(cc -> System.out.printf("aacount: %d  %.2f%n", cc.getNumber(), cc.getBalance()));

    }
}
