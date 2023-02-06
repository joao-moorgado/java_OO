package alog.application;

import java.util.Scanner;

import alog.entities.Cash;

public class log3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cash cash;
        cash = new Cash();

        System.out.println("Quantidade de dinheiro a ser sacado:");
        cash.quantity = sc.nextInt();

        sc.close();

        if (cash.quantity > 1000) {

            System.out.print("Valor acima do saque máximo permitido de R$ 1000,00");

        } else if ((cash.quantity % 20) != 0 && (cash.quantity % 50) != 0) {

            System.out.print("Valor de saque não permitido para notas de 50 e de 20 reais");

        } else {

            System.out.print(cash);

        }

    }
    
}
