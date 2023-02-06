package modulo_4;

import java.util.Scanner;

public class exercicioDentroFora {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar? ");
    int n = sc.nextInt();
    int x, dentro = 0, fora = 0;

    for (int i = 0 ; i < n ; i++ ) {

        System.out.print("Digite um numero: ");
        x = sc.nextInt();

        if (x < 10 || x > 20) {

        fora++;

        } else {

        dentro++;

        }
            
    }

    System.out.print( dentro + " DENTRO\n" + fora + " FORA");   

    sc.close();

    }

}
