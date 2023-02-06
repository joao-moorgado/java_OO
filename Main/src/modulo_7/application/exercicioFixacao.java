package modulo_7.application;

import java.util.Scanner;

import modulo_7.entities.Account;

import java.util.Locale;

public class exercicioFixacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Account account;
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char initial = sc.next().charAt(0);

        if (initial == 'n') {

            account = new Account(number, holder);

        } else {

            System.out.println("\nEnter initial deposit value: ");
            double balance = sc.nextDouble();

            account = new Account(number, holder, balance);

        }

        System.out.println("\nAccount data:\n" + account);

        System.out.println("\nEnter a deposit value: ");
        double amount = sc.nextDouble();
        account.deposit(amount);

        System.out.println("\nUpdated account data:\n" + account);

        System.out.println("\nEnter a withdraw value: ");
        amount = sc.nextDouble();
        account.withdraw(amount);

        System.out.println("\nUpdated account data:\n" + account);

        sc.close();

    }
    
}
