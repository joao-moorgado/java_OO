package modulo_8.exercicioAprovados;

import java.util.Scanner;
import java.util.Locale;

public class application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        String[] vectName = new String[n];
        double[] vectNota1 = new double[n];
        double[] vectNota2 = new double[n];

        for(int i = 0 ; i < n ; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
            sc.nextLine();
            vectName[i] = sc.nextLine();
            vectNota1[i] = sc.nextDouble();
            vectNota2[i] = sc.nextDouble();
        }

        sc.close();

        System.out.println("Alunos aprovados:");

        for(int i = 0 ; i < n ; i++) {
            if((vectNota1[i] + vectNota2[i]) / 2 >= 6) {
                System.out.println(vectName[i]);
            }
        }

    }
    
}
