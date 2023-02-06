package modulo_6.exercicioAlunos.application;

import java.util.Locale;
import java.util.Scanner;

import modulo_6.exercicioAlunos.entities.Student;

public class exercicioAlunos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student aluno;
        aluno = new Student();

        aluno.name = sc.nextLine();
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        aluno.notas(nota1, nota2, nota3);

        System.out.print(aluno);

        sc.close();

    }
    
}
