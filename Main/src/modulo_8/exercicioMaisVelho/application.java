package modulo_8.exercicioMaisVelho;

import java.util.Scanner;

public class application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        String[] vectName = new String[n];
        int[] vectIdade = new int[n];

        for (int i = 0 ; i < n ; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            vectName[i] = sc.nextLine();
            System.out.print("Idade: ");
            vectIdade[i] = sc.nextInt();
        }

        sc.close();

        int maior = 0;

        for (int i = 0 ; i < n ; i++) {

            if (vectIdade[i] > maior) {
                maior = i;
            }

        }

        System.out.print("Pessoa mais velha = " + vectName[maior]);

    }
    
}
