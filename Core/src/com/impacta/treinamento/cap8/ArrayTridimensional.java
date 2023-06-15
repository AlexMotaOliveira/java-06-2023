package com.impacta.treinamento.cap8;

public class ArrayTridimensional {


    public static void main(String[] args) {

        int notas[][][] = new int[2][2][2];

//        int notas1[][][] = new int[][][]{{{1, 2}, {1, 2}}, {{1, 2}, {1, 2}}};

        // [matricula][materia][bimestre] = nota


        // aluno 0
        // portugues
        notas[0][0][0] = 5;
        notas[0][0][1] = 9;
        //matematica
        notas[0][1][0] = 10;
        notas[0][1][1] = 9;

        // aluno 1
        // portugues
        notas[1][0][0] = 8;
        notas[1][0][1] = 7;
        //matematica
        notas[1][1][0] = 3;
        notas[1][1][1] = 1;

        for (int matricula = 0; matricula < notas.length; matricula++) {
            int quantidadeDeMaterias = notas[matricula].length;
            for (int materias = 0; materias < quantidadeDeMaterias; materias++) {
                int quantidadeDeNotas = notas[matricula][materias].length;
                for (int nota = 0; nota < quantidadeDeNotas; nota++) {
                    int valorDaNota = notas[matricula][materias][nota];
                    System.out.println("o aluno da matricula " + matricula
                            + " da materia " + materias
                            + " nota: " + valorDaNota + " do bimestre: " + nota);
                }
            }
        }
    }
}
