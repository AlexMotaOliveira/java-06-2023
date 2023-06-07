package estrutura;

public class Laboratorio1 {

    public static void main(String[] args) {

        int numero = 337;

        if (numero == 0 || numero == 1) {
            System.out.println(numero + " não é um numero primo");
        } else {

            int contador = 0;
            int divisor = 1;
            while (divisor <= numero) {
                if (numero % divisor == 0) {
                    contador++;
                }
                divisor++;
            }

            if (contador == 2) {
                System.out.println(numero + " é um numero primo");
            } else {
                System.out.println(numero + " não é um numero primo");
            }
        }
    }
}
