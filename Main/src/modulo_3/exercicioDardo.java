package modulo_3;

import java.util.Locale;
import java.util.Scanner;

public class exercicioDardo {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as tres distancias:\n");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double maior;

        if (a >= b && a >= c) {

            maior = a;

        } else if (b >= a && b >= c) {

            maior = b;

        } else {

            maior = c;

        }

        System.out.printf("Maior distancia = %.2f", maior);

        sc.close();

    }

}
