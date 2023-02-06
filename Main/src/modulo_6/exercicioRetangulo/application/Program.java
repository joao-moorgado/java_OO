package modulo_6.exercicioRetangulo.application;

import java.util.Locale;
import java.util.Scanner;

import modulo_6.exercicioRetangulo.entities.Rectangle;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a largura e altura do retângulo: \n");
        
        Rectangle medidas;
        medidas = new Rectangle();

        medidas.width = sc.nextDouble();
        medidas.height = sc.nextDouble();

        System.out.print(medidas);

        sc.close();

    }
}