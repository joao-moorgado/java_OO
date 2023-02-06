package modulo_8.exercicioAlturas.application;

import java.util.Scanner;
import java.util.Locale;

import modulo_8.exercicioAlturas.entitites.People;

public class program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        double soma = 0;
        int under = 0;

        People[] vect = new People[n];

        for(int i = 0 ; i < vect.length ; i++) {

            System.out.println("Dados da " + (i+1) + "a pessoa:");

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            vect[i] = new People(name, age, height);

            soma += height;

            if (age < 16) {
                under++;
            }
        }

        sc.close();

        System.out.printf("Altura média = %.2f%n", (soma/n));
        System.out.println("Pessoas com menos de 16 anos: " + (((double) under / n) * 100) + "%");

        for (int i = 0 ; i < vect.length ; i++) {

            if (vect[i].getAge() < 16) {

                System.out.println(vect[i].getName());

            }

        }

    }
    
}
