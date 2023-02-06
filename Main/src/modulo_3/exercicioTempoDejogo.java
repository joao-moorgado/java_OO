package modulo_3;

import java.util.Scanner;

public class exercicioTempoDejogo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int tinicial = sc.nextInt();
        System.out.print("Hora final: ");
        int tfinal = sc.nextInt();
        int horas;

        if (tinicial > tfinal) {

            horas = (24 - tinicial) + tfinal;
            System.out.print("O jogo durou " + horas + " horas");

        } else if (tfinal == tinicial) {

            System.out.print("O jogo durou 24 horas");

        } else {

            horas = tfinal - tinicial;
            System.out.print("O jogo durou " + horas + " horas");

        }

        sc.close();

    }

}
