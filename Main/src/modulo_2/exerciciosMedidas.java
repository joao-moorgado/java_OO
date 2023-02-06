package modulo_2;
import java.util.Scanner;
import java.util.Locale;

public class exerciciosMedidas {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Digite a medida A: ");
        a = sc.nextDouble();
        System.out.print("Digite a medida B: ");
        b = sc.nextDouble();
        System.out.print("Digite a medida C: ");
        c = sc.nextDouble();

        double quadrado = a * a;
        double triangulo = ( a * b ) / 2;
        double trapezio = (( a + b ) * c ) / 2;

        System.out.printf("Area do quadrado = %.4f%nArea do triangulo = %.4f%nArea do trapezio = %.4f", quadrado, triangulo, trapezio);

        sc.close();

    }

}
