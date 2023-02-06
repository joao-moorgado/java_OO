package modulo_8.exercicioSomaVetor;

import java.util.Scanner;
import java.util.Locale;

public class program {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Locale.setDefault(Locale.US);

    System.out.print("Quantos numeros voce vai digitar? ");
    int n = sc.nextInt();
    double[] vect = new double[n];

    double soma = 0;

    for (int i = 0 ; i < n ; i++) {

        System.out.print("Digite um numero: ");
        vect[i] = sc.nextDouble();
        soma += vect[i];

    }

    sc.close();

    double media = soma / n;

    System.out.print("\nValores =");

    for (int i = 0 ; i < n ; i++) {

        System.out.printf(" %.1f", vect[i]);

    }

    System.out.printf("%nSoma = %.2f%nMedia = %.2f", soma, media);

    }
    
}
