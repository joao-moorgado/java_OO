package modulo_3;
import java.util.Scanner;
import java.util.Locale;

public class exercicioNotas {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double notaFinal = nota1 + nota2;

        System.out.printf("Nota final = %.1f", notaFinal);

        if (notaFinal <= 60.0) {

            System.out.print("\nREPROVADO");

        }

        sc.close();

    }

}
