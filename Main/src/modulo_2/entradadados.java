package modulo_2;
import java.util.Scanner;

public class entradadados {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println(x);
        //apenas o "next" sem qualquer complemente, comporta apenas string.

        int y;
        y = sc.nextInt();
        System.out.println(y);

        double z;
        z = sc.nextDouble();
        System.out.println(z);

        char w;
        w = sc.next().charAt(0);
        System.out.println(w);

        sc.close();
    }

}
