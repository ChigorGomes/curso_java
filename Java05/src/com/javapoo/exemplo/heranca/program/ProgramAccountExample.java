package com.javapoo.exemplo.heranca.program;

import com.javapoo.exemplo.heranca.entities.Account;
import com.javapoo.exemplo.heranca.entities.BusinessAccount;
import com.javapoo.exemplo.heranca.entities.SavingsAccount;

public class ProgramAccountExample {
    public static void main(String[] args) {
        Account account = new Account(1001, "Alex", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING -> Instancia um objeto  da subclasse  para uma superclasse

        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account account3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);


        //DOWNCASTING Instancia um objeto da superclasse para a subclasse

        BusinessAccount account4 = (BusinessAccount) account2; //cast manual
        account4.loan(100);


        // BusinessAccount account5 = (BusinessAccount) account3; // não é aceito, pois businnesacount não é um savingsaccount

        //Melhor prática
        if (account3 instanceof BusinessAccount) {
            BusinessAccount account5 = (BusinessAccount) account3;
            account5.loan(200);
            System.out.println("Loan!");
        }

        if (account3 instanceof SavingsAccount) {
            SavingsAccount account5 = (SavingsAccount) account3;
            account5.updateBalance();
            System.out.println("Update!");
        }


    }
}
