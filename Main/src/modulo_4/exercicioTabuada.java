package modulo_4;

import java.util.Scanner;

public class exercicioTabuada {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.print("Deseja a tabuada para qual valor? ");
        int x = sc.nextInt();

        for (int i = 1 ; i <= 10 ; i++) {

            System.out.println(x + " x " + i + " = " + x * i);

        }

        sc.close();

    }

}
