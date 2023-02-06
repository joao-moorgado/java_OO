package modulo_2;
import java.util.Locale;
import java.util.Scanner;

public class exercicioIdade {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        System.out.print("Dados da primeira pessoa:\nNome: ");
        nome = sc.nextLine();
        System.out.print("Idade: ");
        idade = sc.nextInt();
        sc.nextLine();

        double idade1 = (double) idade;
        String nome1= nome;

        System.out.print("Dados da segunda pessoa:\nNome: ");
        nome = sc.nextLine();
        System.out.print("Idade: ");
        idade = sc.nextInt();

        double idade2 = (double) idade;
        String nome2= nome;

        double media = (idade1 + idade2) / 2;

        System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);

        sc.close();

    }
}
