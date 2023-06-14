package com.impacta.treinamento.cap8.laboratorio;

public class Cap8_Lab1 {

    public static int maiorNumero(int array[]) {

        int maior = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maior) {
                maior = array[index];
            }
        }
        return maior;
    }

    public static void main(String[] args) {

        int numeros[] = {100, 2, 235, 5845, 1, 6525489, 1000000};
        int maiorNumero = maiorNumero(numeros);

        for (int elementos : numeros) {
            System.out.print(" " + elementos);
        }

        System.out.println();
        System.out.println("Maior numero encontrado foi: " + maiorNumero);

    }

}
