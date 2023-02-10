package modulo_8.exercicioMediaPares;

import java.util.Scanner;
import java.util.Locale;

public class application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0 ; i < vect.length ; i++) {

            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();

        }

        sc.close();

        double soma = 0;
        int qnt = 0;

        for (int i = 0 ; i < vect.length ; i++) {

            if (vect[i] % 2 == 0) {
                soma += vect[i];
                qnt++;
            }

        } if (qnt == 0) {

            System.out.print("Nenhum numero par");

        } else {

            System.out.printf("Media dos pares = %.1f", (soma / qnt));

        }        

    }
    
}
