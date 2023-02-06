package modulo_8.exercicioNegativos.application;

import java.util.Scanner;
import java.util.Locale;

import modulo_8.exercicioNegativos.entities.Numbers;

public class program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();

        while (n > 10) {

            System.out.print("Valor maximo = 10. Digite outro valor: ");
            n = sc.nextInt();

        }
        
        while (n < 1) {

            System.out.print("Valor mínimo = 1. Digite outro valor: ");
            n = sc.nextInt();

        }

        Numbers[] vect = new Numbers[n];
        System.out.print("Digite os " + n + " numeros:\n");

        for (int i = 0 ; i < vect.length ; i++) {

            int num = sc.nextInt();
            vect[i] = new Numbers(num);

        }

        sc.close();

        System.out.println("Numeros negativos:");

        for (int i = 0 ; i < n ; i++) {

            if (vect[i].getNum() < 0) {

                System.out.println(vect[i].getNum());

            }

        }

    }
    
}
