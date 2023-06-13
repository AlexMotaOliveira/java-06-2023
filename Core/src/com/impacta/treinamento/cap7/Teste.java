package com.impacta.treinamento.cap7;

import java.io.PrintStream;

public class Teste {


    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Javanes");
        Aluno aluno1 = new Aluno("Alex");
        Aluno aluno2 = new Aluno("Alex", 3);
        System.out.println("");

        System.out.println(new Aluno("System", 3));
    }
}
