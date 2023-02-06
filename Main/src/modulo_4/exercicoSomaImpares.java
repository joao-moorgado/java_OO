package modulo_4;

import java.util.Scanner;

public class exercicoSomaImpares {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite dois numeros: \n");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int menor, maior, soma = 0;

            if (x < y) {

                menor = x;
                maior = y;

            } else {

                menor = y;
                maior = x;

            } if (menor % 2 != 0) { ///IMPAR

                for ( menor++ ; menor < maior ; menor++) {
                
                    menor++;
                    soma += menor;
                
                }

            } else if (menor % 2 == 0) { ///PAR

                for ( menor++ ; menor < maior ; menor++) {
            
                    soma += menor;
                    menor++;

                }

            }

            System.out.print("SOMA DOS IMPARES = " + soma);

        }

    }

}
