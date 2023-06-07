package estrutura;

public class While {

    public static void main(String[] args) {

        int valor = 1;
        // enquanto for verdadeiro
        while (valor <= 10) {
            System.out.println("valor é: " + valor);
            if(valor == 8){
                break;
            }
            valor ++;
        }

        System.out.println("_____________________");

        do{
            System.out.println("valor é: " + valor);
        }while (valor-- >= 0);

    }
}
