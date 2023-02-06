package modulo_3;

import java.util.Locale;
import java.util.Scanner;

public class exercicioCoordenadas {
 
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de X: ");
        double x = sc.nextDouble();
        System.out.print("Valor de Y: ");
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {

            System.out.print("Origem");

        } else if (x == 0) {

            System.out.print("Eixo Y");

        } else if (y == 0) {

            System.out.print("Eixo X");

        } else if (x < 0 && y < 0) {

            System.out.print("Q3");

        } else if (x < 0 && y > 0) {

            System.out.print("Q2");

        } else if (x > 0 && y < 0) {

            System.out.print("Q4");

        } else {

            System.out.print("Q1");

        }

        sc.close();

    }

}
