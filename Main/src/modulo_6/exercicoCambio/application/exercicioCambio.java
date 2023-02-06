package modulo_6.exercicoCambio.application;

import java.util.Scanner;
import java.util.Locale;

import modulo_6.exercicoCambio.entities.CurrencyConverter;

public class exercicioCambio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Qual a cotacao do dolar? ");
        double dolar = sc.nextDouble();
        System.out.print("Quantos dolares serao comprados? ");
        double quantity = sc.nextDouble();

        sc.close();

        System.out.printf("Valor a ser pago em reais = %.2f", CurrencyConverter.calculator(dolar, quantity));

    }
    
}
