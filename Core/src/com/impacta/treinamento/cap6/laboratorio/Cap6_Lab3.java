package com.impacta.treinamento.cap6.laboratorio;

public class Cap6_Lab3 {

    public static void main(String[] args) {

        Aluno joao = new Aluno();
        joao.setNome("João");
        Aluno.contadorDeAlunos++;
        System.out.println(joao);

        Aluno maria = new Aluno();
        maria.setNome("Maria");
        Aluno.contadorDeAlunos++;
        System.out.println(joao);

        Aluno marcos = new Aluno();
        marcos.setNome("Marcos");
        Aluno.contadorDeAlunos++;
        System.out.println(joao);

        System.out.println(Aluno.contadorDeAlunos);
    }
}
