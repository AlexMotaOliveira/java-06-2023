package com.impacta.treinamento.cap8;

public class ExemploArrayParametros {

    public static void main(String[] args) {

        int valoresA[] = new int[3];
        int valoresB[] = new int[3];

        valoresA[0] = 10; // 10 * 2 = 20
        valoresA[1] = 20; // 20 * 2 = 40
        valoresA[2] = 30; // 30 * 2 = 60

        valoresB = dobrarValores(valoresA);

        System.out.println("valores do array valoresA após o metodo de dobrarValores");
        for (int i = 0; i < valoresB.length; i++) {
            System.out.println("valoresA[" + i + "] = " + valoresB[i]);
        }

        for (int i = 0; i < valoresB.length; i++) {
            System.out.println("valoresB[" + i + "] = " + valoresB[i]);
        }

    }
    private static int[] dobrarValores(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            valores[i] *= 2;
        }
        return valores;
    }
}
