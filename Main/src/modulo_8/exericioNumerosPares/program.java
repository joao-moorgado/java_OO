package modulo_8.exericioNumerosPares;

import java.util.Scanner;

import modulo_8.exericioNumerosPares.program;

public class program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int i = 0 ; i < vect.length ; i++) {

            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();

        }

        sc.close();

        System.out.println("\nNumeros pares:");
        int qntd = 0;

        for(int i = 0 ; i < vect.length ; i++) {

           if (vect[i] % 2 == 0) {

            System.out.print(vect[i] + " ");
            qntd++;

           }

        }

        System.out.print("\nNumero de pares = " + qntd);

    }
    
}
