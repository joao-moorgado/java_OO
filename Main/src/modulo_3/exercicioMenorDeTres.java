package modulo_3;

import java.util.Scanner;

public class exercicioMenorDeTres {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, menor;

        System.out.print("Primeiro valor: ");
        a = sc.nextInt();
        System.out.print("Segundo valor: ");
        b = sc.nextInt();
        System.out.print("Terceiro valor:");
        c = sc.nextInt();

        if (a <= c && a <= b) {

            menor = a;

        } else if (b <= a && b <= c) {

            menor = b;

        } else {

            menor = c;

        }

        System.out.printf("Menor = %d", menor);

        sc.close();

    }

}
