package modulo_8.exercicioDadosPessoas;

import java.util.Scanner;
import java.util.Locale;

public class application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        double[] vectHeight = new double[n];
        char[] vectGem = new char[n];

        for(int i = 0 ; i < n ; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            vectHeight[i] = sc.nextDouble();
            System.out.print("Genero da " + (i+1) + "a pessoa: ");
            vectGem[i] = sc.next().charAt(0);
        }

        sc.close();

        double menor = 3, maior = 0, soma = 0;
        int female = 0, male = 0;

        for(int i = 0 ; i < n ; i++) {

            if (vectHeight[i] < menor) {
                menor = vectHeight[i];
            }
            if (vectHeight[i] > maior) {
                maior = vectHeight[i];
            }
            if (vectGem[i] == 'F') {
                soma += vectHeight[i];
                female++;
            }
            if (vectGem[i] == 'M') {
                male++;
            }
        }

        System.out.printf("Menor altura = %.2f%n", menor);
        System.out.printf("Maior altura = %.2f%n", maior);
        System.out.printf("Media das alturas das mulheres = %.2f%n", (soma / female));
        System.out.printf("Numero de homens = %d", male);

    }
    
}
