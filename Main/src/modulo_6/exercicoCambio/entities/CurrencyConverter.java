package modulo_6.exercicoCambio.entities;

public class CurrencyConverter {

    public static double calculator (double dolar, double quantity) {

        return (dolar * quantity) + ((dolar * quantity) * 0.06);

    }
}
