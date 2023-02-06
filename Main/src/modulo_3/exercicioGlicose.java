package modulo_3;

import java.util.Locale;
import java.util.Scanner;

public class exercicioGlicose {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida para glicose: ");
        double glicose = sc.nextDouble();

        if (glicose > 100 && glicose <=140) {

            System.out.print("Elevado");

        } else if (glicose >= 140) {

            System.out.print("Vai se tratar garotaaaaaaa");

        } else {

            System.out.print("Normal");

        }

        sc.close();

    }

}
