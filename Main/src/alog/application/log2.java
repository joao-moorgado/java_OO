package alog.application;

import java.util.Scanner;

import alog.entities.Product;

public class log2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product produto;
        produto = new Product();

        System.out.print("Qual o tipo do produto?\n(A) para Areia\n(P) para Pedrita\n(B) para Brita\n(S) para Saibro\n");
        produto.tipe = sc.next().charAt(0);
        System.out.print("Qual a composição do produto?\n(F) para Fino\n(M) para Medio\n(G) para Grosso\n");
        produto.composition = sc.next().charAt(0);
        System.out.print("Qual a quantidade do produto?\n");
        produto.quantity = sc.nextDouble();

        sc.close();

        System.out.print(produto);

    }
    
}
