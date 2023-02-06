package modulo_2;

public class conta {
    
    public static void main(String[] args) {

        int x, y;

        x = 5;

        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        int a, b;
        double resultado;

         a = 2;
         b = 5;

         resultado = (double) b / a;
         //o (double) é usado para fazer os "casting", que é a conversão explicita dos valores.
         //fazendo assim com que as variáveis int "a" e "b" virem double.

         System.out.print(resultado);
        

    }

}
