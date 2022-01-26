package com.javapoo.exemplo.heranca.program;

import com.javapoo.exemplo.heranca.entities.Account;
import com.javapoo.exemplo.heranca.entities.BusinessAccount;
import com.javapoo.exemplo.heranca.entities.SavingsAccount;

public class ProgramAccount {
    public static void main(String[] args) {
        Account account = new Account(1001, "Alex", 1000.0);
        account.withdraw(200);
        System.out.println(account.getBalance());

        Account account2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01); //upcasting
        account2.withdraw(200);
        System.out.println(account2.getBalance());


        Account account3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        account3.withdraw(200);
        System.out.println(account3.getBalance());


        // POLIMORFISMO - Muita formas
        // variáveis do mesmo tipo que apontam para Classes difentes e tem comportamentos diferentes

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());


    }
}
