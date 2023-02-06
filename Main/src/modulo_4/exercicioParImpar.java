package modulo_4;

import java.util.Scanner;

public class exercicioParImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int x = 0;

        for (int i = 0 ; i < n ; i++) {

            System.out.print("Digite um numero: ");
            x = sc.nextInt();

            if (x > 0) { /// POSITIVO

                    if (x % 2 == 0) { /// PAR

                        System.out.print("PAR POSITIVO\n");

                    } else { /// IMPAR

                        System.out.print("IMPAR POSITIVO\n");

                    }

            } else if (x < 0) {  ///NEGATIVO

                if (x % 2 == 0) { /// PAR

                    System.out.print("PAR NEGATIVO\n");

                } else { /// IMPAR

                    System.out.print("IMPAR NEGATIVO\n");

                }

            } else {

                System.out.print("NULO\n");

            }

        }

        sc.close();

    }

}
