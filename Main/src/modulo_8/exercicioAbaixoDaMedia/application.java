package modulo_8.exercicioAbaixoDaMedia;

import java.util.Scanner;
import java.util.Locale;

public class application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        double soma = 0;

        for(int i = 0 ; i < vect.length ; i++) {

            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];

        }

        sc.close();

        System.out.printf("%nMedia do vetor = %.3f%n", (soma / vect.length));
        System.out.println("Elementos abaixo da media:");

        for(int i = 0 ; i < vect.length ; i++) {

            if(vect[i] < (soma / vect.length)) {

                System.out.printf("%.1f%n", vect[i]);

            }

        }

    }
    
}
