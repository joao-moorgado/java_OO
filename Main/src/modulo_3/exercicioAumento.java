package modulo_3;

import java.util.Locale;
import java.util.Scanner;

public class exercicioAumento {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario da pessoa: ");
        double salario = sc.nextDouble();
        double aumento, novoSalario, porcentagem;

        if (salario <= 1000) {

            porcentagem = 0.2;
            aumento = salario * porcentagem;
            novoSalario = salario + aumento;

            System.out.printf("Novo salario = R$ %.2f%nAumento = R$ %.2f%n", novoSalario, aumento);
            System.out.print("Porcentagem = 20 %");

        } else if (salario > 1000 && salario <= 3000) {

            porcentagem = 0.15;
            aumento = salario * porcentagem;
            novoSalario = salario + aumento;

            System.out.printf("Novo salario = R$ %.2f%nAumento = R$ %.2f%n", novoSalario, aumento);
            System.out.print("Porcentagem = 15 %");

        } else if (salario > 3000 && salario <= 8000) {

            porcentagem = 0.1;
            aumento = salario * porcentagem;
            novoSalario = salario + aumento;

            System.out.printf("Novo salario = R$ %.2f%nAumento = R$ %.2f%n", novoSalario, aumento);
            System.out.print("Porcentagem = 10 %");

        } else {

            porcentagem = 0.05;
            aumento = salario * porcentagem;
            novoSalario = salario + aumento;

            System.out.printf("Novo salario = R$ %.2f%nAumento = R$ %.2f%n", novoSalario, aumento);
            System.out.print("Porcentagem = 5 %");

        }

        sc.close();

    }

}
