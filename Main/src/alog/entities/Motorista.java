package alog.entities;

public class Motorista {
    
    public double valor;
    public char sexo;
    public int idade;
    public int perfil1;
    public char perfil2;

        public double seguro() {

            return (valor * 0.1);

        }

        public double desconto() {

            double descontoTotal = 0;

            if (sexo == 'F') {

                descontoTotal += seguro() * 0.075;

            } if (idade >= 25 && idade < 40) {

                descontoTotal += seguro() * 0.025;

            } if (idade > 40) {

                descontoTotal += seguro() * 0.037;

            } if (perfil1 == 1) {

                descontoTotal += seguro() * 0.015;

            } if (perfil2 == '1') {

                descontoTotal += seguro() * 0.018;

            }

            return descontoTotal;

        }

        public String toString() {

            double valorFinal  = seguro() - desconto();

            return "Valor do seguro = "
                + String.format("%.2f", seguro())
                + " - "
                + String.format("%.2f", desconto())
                + " = "
                + String.format("%.2f", valorFinal);

        }

}