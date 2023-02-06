package modulo_8.exercicioMaiorPosicao;

import java.util.Scanner;
import java.util.Locale;

public class program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n =  sc.nextInt();
        double[] vect = new double[n];
        double maior = 0;
        int position = 0;

        for (int i = 0 ; i < n ; i++) {

            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();

            if (vect[i] > maior) {
                maior = vect[i];
                position = i;
            }

        }

        sc.close();

        System.out.printf("Maior valor = %.1f%nPosicao do maior valor = %d", maior, position);

    }
    
}
