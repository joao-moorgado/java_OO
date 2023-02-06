package modulo_2;
import java.util.Scanner;

public class exercicioTerreno {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double l, c, v;

        System.out.print("Digite a largura do terreno: ");
        l = sc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        c = sc.nextDouble();
        System.out.print("Digite o valor do metro quadrado: ");
        v = sc.nextDouble();

        double a = l * c;
        double p = a * v;

        System.out.printf("Area do terreno = %.2f%n", a);
        System.out.printf("Preco do terreno = %.2f", p);

        sc.close();
    }

}
