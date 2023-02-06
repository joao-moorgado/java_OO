package modulo_4;

import java.util.Scanner;
import java.util.Locale;

public class exercicioValidacaoDeNota {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double a = sc.nextDouble();

        while (a < 0 || a > 10) {

            System.out.print("Valor invalido! Tente novamente: ");

            System.out.print("\nDigite a primeira nota: ");
            a = sc.nextDouble();

        }

        System.out.print("Digite a segunda nota: ");
        double b = sc.nextDouble();

        while (b < 0 || b > 10) {

            System.out.print("Valor invalido! Tente novamente: ");

            System.out.print("\nDigite a segunda nota: ");
            b = sc.nextDouble();

        }

        double media = (a + b) / 2;
        System.out.printf("Media = %.2f", media);

        sc.close();

    }

}
