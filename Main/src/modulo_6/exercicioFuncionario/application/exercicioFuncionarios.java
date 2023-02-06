package modulo_6.exercicioFuncionario.application;

import java.util.Scanner;
import java.util.Locale;

import modulo_6.exercicioFuncionario.entities.Employee;

public class exercicioFuncionarios {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee funcionario;
        funcionario = new Employee();

        System.out.print("Nome: ");
        funcionario.name = sc.nextLine();
        System.out.print("Salario Bruto: ");
        funcionario.grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        funcionario.tax = sc.nextDouble();

        System.out.print("Funcionario: " + funcionario);

        System.out.print("\nQual a porcentagem para aumentar o salário? ");
        double porcentage = sc.nextDouble();
        funcionario.increaseSalary(porcentage);
        
        System.out.print("Dados atualizados: " + funcionario);


        sc.close();

    }
    
}
