package modulo_2;
import java.util.Locale;

public class saida {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int y = 32;
        double x = 10.35784;
        double z = 5.43238;

        System.out.println(y);
        System.out.println(x);
        System.out.println(z);

        System.out.print("\n");

        System.out.printf("O valor do x igual a %.2f%n", x);

        System.out.println("O valor do x é igual a " + x + "!");
        System.out.printf("O valor de x é igual a %f e o de z igual a %f! %n", x, z);

        System.out.print("\n");

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha %.2f yenes. %n", nome, idade, renda);

    }

}
