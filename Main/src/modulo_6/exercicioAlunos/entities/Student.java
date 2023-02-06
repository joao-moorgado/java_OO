package modulo_6.exercicioAlunos.entities;

public class Student {

    public String name;
    public double notas;

    public void notas (double nota1, double nota2, double nota3) {

        notas = nota1 + nota2 + nota3;

    }

    public String toString() {

        String resultado;

        if (notas >= 60) {

            resultado = "Pass";

        } else {

            double faltou = 60 - notas;
            resultado = "Failed\n" + "Faltaram " + faltou + " pontos";

        }

        return "Nota final = "
            + String.format("%.2f", notas)
            + "\n"
            + resultado;

    }

}
    
