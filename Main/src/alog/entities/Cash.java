package alog.entities;

public class Cash {

    public int quantity;

    public int quantity20() {

        int i = 0;
        int q = quantity;

        while ((q % 50) != 0) {

            q -= 20;
            i++;

        }

        return i;

    }

    public int quantity50() {

        int x = quantity - (20 * quantity20());
        return x / 50;

    }

    public String toString() {

        return quantity50()
        + " nota(s) de 50 " 
        + quantity20()
        + " nota(s) de 20";

    }
    
}
