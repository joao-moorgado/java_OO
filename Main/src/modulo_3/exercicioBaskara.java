package modulo_3;

import java.util.Locale;
import java.util.Scanner;

public class exercicioBaskara {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Coeficiente a: ");
        a = sc.nextDouble();
        System.out.print("Coeficiente b: ");
        b = sc.nextDouble();
        System.out.print("Coeficiente c: ");
        c = sc.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);

        if (!(delta < 0)) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a), x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("X1 = %.4f%n", x1);
            System.out.printf("X2 = %.4f", x2);

        } else {

            System.out.print("Esta equacao nao possui raizes reais");

        }

        sc.close();

    }

}