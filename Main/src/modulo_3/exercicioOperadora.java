package modulo_3;

import java.util.Locale;
import java.util.Scanner;

public class exercicioOperadora {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();
        double valor;

        if (minutos <= 100) {

            valor = 50;

        } else {

            valor = 50 + ((minutos - 100) * 2);

        }

        System.out.printf("Valor a pagar = R$ %.2f", valor);

        sc.close();

    }

}
