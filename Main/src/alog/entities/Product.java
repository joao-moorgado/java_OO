package alog.entities;

public class Product {

    public char tipe;
    public char composition;
    public double quantity;
 
    public double valor() {

        if (tipe == 'A') {

            return 34.00;

        } else if (tipe == 'P') {

            return 42.50;

        } else if (tipe == 'B') {

            return 28.00;

        } else {

            return 27.00;

        }

    }

    public double aditional() {

        if (composition == 'M') {

            return 0.15;

        } else if (composition == 'G') {

            return 0.25;

        } else {

            return 0;

        }

    }

    public String toString() {

        double precoFinal = valor() + (valor() * aditional());
        double valorFinal = (valor() + (valor() * aditional())) * quantity;

        if (valorFinal < 750) {

            valorFinal += 45;

            return String.format("%.2f%n", precoFinal)
            + String.format("%.2f", valorFinal);

        } else {

            return String.format("%.2f%n", precoFinal)
            + String.format("%.2f", valorFinal);

        }


    }

}
