package alog.application;

import java.util.Scanner;

import alog.entities.Motorista;

public class log1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Motorista perfil;
        perfil = new Motorista();

        System.out.print("Digite o valor do carro: \n");
        perfil.valor = sc.nextDouble();
        System.out.print("Qual o sexo da pessoa: (M/F)\n");
        perfil.sexo = sc.next().charAt(0);
        System.out.print("Qual a idade da pessoa? \n");
        perfil.idade = sc.nextInt();
        System.out.print("Quantas pessoas usam o carro? \n");
        perfil.perfil1 = sc.nextInt();
        System.out.print("O carro é utilizado em:\n(1) Somente vias urbanas\n(2) Somente vias rurais\n(3) Vias urbanas e rurais\n");
        perfil.perfil2 = sc.next().charAt(0);

        System.out.print(perfil);

        sc.close();

    }
    
}
