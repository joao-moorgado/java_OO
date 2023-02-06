package modulo_4;

import java.util.Scanner;

public class exercicioSequenciasImpares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();

        for (int i = 1 ; i <= x ; i += 2) {

            System.out.println(i);

        }

        sc.close();

    }
    
}
