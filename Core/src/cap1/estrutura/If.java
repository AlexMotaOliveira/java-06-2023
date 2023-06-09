package cap1.estrutura;

public class If {

    public static void main(String[] args) {
        int valor = 10;
        int valor1 = 0;



        // boolean true ou false
        if (valor > 100) { // false
            valor += 10;
            System.out.println("valor += 10: " + valor);
            valor1++;
        }

        if (valor > 100) { // false
            valor += 10;
            System.out.println("valor += 10: " + valor);
            valor1++;
        } else {
            valor = 10;
            System.out.println("valor = 10: " + valor);
            valor1++;
        }

        if (valor < 20) { // true
            System.out.println("é menor que 20");
            valor1++;
        } else if (valor <= 12) {
            System.out.println("é menor que 12");
            valor1++;
        } else if (valor == 10) {
            System.out.println("é igual a 10");
            valor1++;
        } else {
            System.out.println("não é menor ");
            valor1++;
        }

        System.out.println("valor = 10: " + valor);
        System.out.println("valor1: " + valor1);
    }
}
