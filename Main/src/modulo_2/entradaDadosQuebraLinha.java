package modulo_2;
import java.util.Scanner;

public class entradaDadosQuebraLinha {
   
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int x;
    String s1, s2, s3;
    x = sc.nextInt();
    sc.nextLine();         //Esse nextLine é usado pra consumir a quebra de linha que sobrou. Limpando o buffer.
    s1 = sc.nextLine();
    s2 = sc.nextLine();
    s3 = sc.nextLine();

    System.out.println("DADOS DIGITADOS:");
    System.out.println(x);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    sc.close();

    }

}
