package modulo_2;
import java.util.Scanner;

public class exercicioDuracao {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a duração em segundos: ");
        int segundos = sc.nextInt();

        int hora = segundos / 3600;
        int resto1 = segundos % 3600;
        int minuto = resto1 / 60;
        int resto2 = resto1 % 60;

        System.out.printf("%d:%d:%d", hora, minuto, resto2);

        sc.close();

    }

}
