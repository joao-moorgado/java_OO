package modulo_2;
import java.util.Scanner;
import java.util.Locale;

public class exercicioConsumo {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distancia;
        double combustivel;

        System.out.print("Distancia percorrida: ");
        distancia = sc.nextInt();

        System.out.print("Combustivel gasto: ");
        combustivel = sc.nextDouble();

        System.out.printf("Consumo medio = %.3f", (distancia / combustivel));

        sc.close();

    }

}
