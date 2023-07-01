package com.impacta.treinamento.apendice.laboratorio;

public class ExemploMath {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        int maior = 0;

        for (int i = 0; i < numeros.length; i++) {
            int n = (int) (Math.random() * 100 + 1);
            numeros[i] = n;
            maior = Math.max(maior, n);
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("maior numero aleatorio: " + maior);
    }
}
