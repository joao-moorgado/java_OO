package modulo_4;

import java.util.Scanner;

public class exercicioCombustivel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        int codigo = sc.nextInt();
        int alcool = 0, gasolina = 0, diesel = 0;

        while (codigo != 4) {

            if (codigo == 1) {

                alcool++;

                System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
                codigo = sc.nextInt();

            } else if (codigo == 2) {

                gasolina++;

                System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
                codigo = sc.nextInt();

            } else if (codigo == 3) {

                diesel++;

                System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
                codigo = sc.nextInt();

            } else {

                System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
                codigo = sc.nextInt();

            }

        }

        System.out.print("MUITO OBRIGADO\nAlcool: " + alcool + " \nGasolina: " + gasolina + "\nDiesel: " + diesel);

        sc.close();

    }

}
