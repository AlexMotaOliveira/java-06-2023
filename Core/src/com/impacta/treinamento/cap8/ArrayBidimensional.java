package com.impacta.treinamento.cap8;

public class ArrayBidimensional {

    public static void main(String[] args) {

        int notasDeMatematica[][] = new int[3][4];

        // [matricula][bimestre] = nota
        // [linha][coluna] = nota

        notasDeMatematica[0][0] = 0;
        notasDeMatematica[0][1] = 2;
        notasDeMatematica[0][2] = 3;
        notasDeMatematica[0][3] = 10;

        notasDeMatematica[1][0] = 5;
        notasDeMatematica[1][1] = 6;
        notasDeMatematica[1][2] = 6;
        notasDeMatematica[1][3] = 8;

        notasDeMatematica[2][0] = 7;
        notasDeMatematica[2][1] = 6;
        notasDeMatematica[2][2] = 9;
        notasDeMatematica[2][3] = 0;

        System.out.println("Nota do aluno de matricula 2 do ultimo bimestre: " + notasDeMatematica[2][3]);

        for (int linha = 0; linha < notasDeMatematica.length; linha++) {
            for (int coluna = 0; coluna < notasDeMatematica[linha].length; coluna++) {
                System.out.print("Aluno matricula: " + linha);
                int nota = notasDeMatematica[linha][coluna];
                System.out.println(" nota: " + nota + " do bimestre: " + coluna);
            }
        }
    }
}
