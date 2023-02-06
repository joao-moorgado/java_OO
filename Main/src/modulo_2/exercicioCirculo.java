package modulo_2;
import java.util.Scanner;
import java.util.Locale;

public class exercicioCirculo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r;

        System.out.print("Digite o valor do raio do circulo: ");
        r = sc.nextDouble();

        double area = Math.PI * Math.pow(r, 2);

        System.out.printf("Area = %.3f", area);

        sc.close();

    }
    
}
