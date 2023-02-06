package modulo_3;

import java.util.Locale;
import java.util.Scanner;

public class exercicioLanchonete {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Codigo do produto comprado: ");
        int codigo = sc.nextInt();
        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();
        double valor;

        switch (codigo) {
            case 1:
                valor = 5 * quantidade;
                break;
            case 2:
                valor = 3.5 * quantidade;
                break;
            case 3:
                valor = 4.8 * quantidade;
                break;
            case 4:
                valor = 8.9 * quantidade;
                break;
            default:
                valor = 7.32 * quantidade;
                break;
        }

        System.out.printf("Valor a pagar: R$ %.2f", valor);

        sc.close();

    }

}
