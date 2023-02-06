package modulo_4;

import java.util.Locale;
import java.util.Scanner;

public class exercicioDivisao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos casos voce vai digitar? ");
        int n = sc.nextInt();
        double x, y, d;

        for (int i = 0 ; i < n ; i++) {

            System.out.print("Entre com o nominador: ");
            x = sc.nextDouble();
            System.out.print("Entre com o denominador: ");
            y = sc.nextDouble();

            if (y == 0) {

                System.out.print("Divisao impossivel\n");

            } else {

            d = x / y;

            System.out.printf("Divisão = %.2f%n", d);

            }

        }

        sc.close();

    }

    
}
