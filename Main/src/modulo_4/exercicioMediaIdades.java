package modulo_4;

import java.util.Locale;
import java.util.Scanner;

public class exercicioMediaIdades {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as idades: ");
        int idade = sc.nextInt();
        int total = 0, i = 0;

        if (idade > 0) {

            while (idade > 0) {

                total += idade;
                i++;

                idade = sc.nextInt();

            }
        
            double media = (double) total / i;

            System.out.printf("Media = %.2f", media);
        
        } else {

            System.out.print("Impossível Calcular");

        }

        sc.close();

    }

}
