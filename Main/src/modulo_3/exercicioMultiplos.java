package modulo_3;

import java.util.Scanner;

public class exercicioMultiplos {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite dois numeros inteiros:\n");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {

            System.out.print("Sao multiplos!");

        } else {

            System.out.print("Não são multiplos!");

        }

        sc.close();

    }

}
