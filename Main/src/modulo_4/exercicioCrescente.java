package modulo_4;

import java.util.Scanner;

public class exercicioCrescente {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != y) {

            if (x > y) {

                System.out.println("Decrescente!");

            } else {

                System.out.println("Crescente!");

            }

            System.out.println("Digite outros dois números: ");
            x = sc.nextInt();
            y = sc.nextInt();

        }

        sc.close();

    }

}
