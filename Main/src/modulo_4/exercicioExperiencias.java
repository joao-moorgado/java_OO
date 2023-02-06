package modulo_4;

import java.util.Scanner;
import java.util.Locale;

public class exercicioExperiencias {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos casos de teste serao digitados? ");
        int n = sc.nextInt();
        int q, c = 0, r = 0, s = 0;
        char t;

        for (int i = 0 ; i < n ; i++) {

            System.out.print("Quantidade de cobaias: ");
            q = sc.nextInt();
            System.out.print("Tipo de cobaia: ");
            t = sc.next().charAt(0);

            if (t == 'C') {

                c += q;

            } else if (t == 'R') {

                r += q;

            } else if (t == 'S') {

                s += q;

            }

        }

        int total = c + r + s;

        double pc = ((double) c / total) * 100;
        double pr = ((double) r / total) * 100;
        double ps = ((double) s / total) * 100;

        System.out.printf("RELATORIO FINAL:%nTotal: %d cobaias%nTotal de coelhos: %d%nTotal de ratos: %d%nTotal de sapos: %d%nPercentual de coelhos: %.2f%nPercentual de ratos: %.2f%nPercentual de sapos: %.2f%n", total, c, r, s, pc, pr, ps);

        sc.close();

    }
    
}
