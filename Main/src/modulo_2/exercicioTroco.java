package modulo_2;
import java.util.Locale;
import java.util.Scanner;

public class exercicioTroco {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double preco, dinheiro;
        int quantidade;

        System.out.print("Preço unitário do produto: ");
        preco = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        dinheiro = sc.nextDouble();

        double troco = dinheiro - (preco * quantidade);

        System.out.printf("Troco = %.2f", troco);

        sc.close();

    }

}
