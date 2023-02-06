package modulo_3;

import java.util.Locale;
import java.util.Scanner;

public class exercicioTrocoVerificado {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preco unitario do produto: ");
        double produto = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        double dinheiro = sc.nextDouble();

        double valor = produto * quantidade;
        double troco;

        if (valor <= dinheiro) {

            troco = dinheiro - valor;
            System.out.printf("Troco = %.2f", troco);

        } else {

            troco = valor - dinheiro;
            System.out.printf("Dinheiro insuficiente. Faltam %.2f reais", troco);

        }

        sc.close();

    }

}
