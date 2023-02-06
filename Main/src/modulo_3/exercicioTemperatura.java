package modulo_3;

import java.util.Locale;
import java.util.Scanner;

public class exercicioTemperatura {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char escala = sc.next().charAt(0);

        if (escala == 'F') {

            System.out.print("Digite a temperatura em Fahrenheit: ");
            double temperatura = sc.nextDouble();

            double celcius = (temperatura - 32) / 1.8;

            System.out.printf("Temperatura equivalente em Celsius: %.2f", celcius);

        } else {

            System.out.print("Digite a temperatura em Celcius: ");
            double temperatura = sc.nextDouble();

            double fahrenheit = (1.8 * temperatura) + 32;

            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", fahrenheit);

        }

        sc.close();
    }

}
