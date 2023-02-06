package modulo_4;

import java.util.Scanner;

public class exercicioQuadrante {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores das coordenadas X e Y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {

            if (x < 0 && y < 0) {

                System.out.print("QUADRANTE Q3\n");

            } else if (x < 0 && y > 0) {

                System.out.print("QUADRANTE Q2\n");

            } else if (x > 0 && y < 0) {

                System.out.print("QUADRANTE Q4\n");

            } else {

                System.out.print("QUADRANTE Q1\n");

            }

            System.out.println("Digite os valores das coordenadas X e Y: ");
            x = sc.nextInt();
            y = sc.nextInt();

        }

        sc.close();

    }

}
