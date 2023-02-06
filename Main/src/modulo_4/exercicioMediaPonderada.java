package modulo_4;

import java.util.Locale;
import java.util.Scanner;

public class exercicioMediaPonderada {

    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos casos voce vai digitar? ");
    double n = sc.nextDouble();
    double x, y, z, m;

    for (int i = 0 ; i < n ; i++) {

        System.out.print("Digite tres numeros: \n");
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();

        m = ((x * 2) + (y * 3) + (z * 5)) / 10;

        System.out.printf("Media = %.1f%n", m);

    }

    sc.close();
    
    }

}
