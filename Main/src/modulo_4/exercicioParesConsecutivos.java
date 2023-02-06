package modulo_4;

import java.util.Scanner;

public class exercicioParesConsecutivos {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int x = sc.nextInt();
        int soma, resto;

        while (x != 0) {

            resto = x % 2;

            if (resto == 0) {

                soma = x + ( x + 2 ) + ( x + 4 ) + ( x + 6 ) + ( x + 8 );
                System.out.print("SOMA = " + soma);

            } else if(resto != 0) {

                soma = ( x + 1 ) + ( x + 3 ) + ( x + 5 ) + ( x + 7 ) + ( x + 9 );
                System.out.print("SOMA = " + soma);

            }

            System.out.print("\nDigite um numero inteiro: ");
            x = sc.nextInt();

        }

        sc.close();

    }

}
