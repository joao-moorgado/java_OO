package modulo_2;
import java.util.Locale;
import java.util.Scanner;

public class exercicioRetangulo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double b, a;

        System.out.print("Base do retângulo: ");
        b = sc.nextDouble();
        System.out.print("Altura do retângulo: ");
        a = sc.nextDouble();

        double area = b * a;
        double perimetro = 2 * (b + a);
        double diagonal = Math.sqrt(Math.pow(b, 2) + Math.pow(a, 2));

        System.out.printf("Área = %.4f%n", area);
        System.out.printf("Perímetro = %.4f%n", perimetro);
        System.out.printf("Diagonal = %.4f%n", diagonal);

        sc.close();
    }
    
}
