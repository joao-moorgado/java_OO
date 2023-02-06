package modulo_2;
import java.util.Scanner;
import java.util.Locale;

public class exercicioPagamento {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double valor;
        int horas;

        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Valor por hora: ");
        valor = sc.nextDouble();

        System.out.print("Horas trabalhadas: ");
        horas = sc.nextInt();

        double pagamento = valor * horas;

        System.out.printf("O pagamento para %s deve ser %.2f", nome, pagamento);

        sc.close();

    }

}
