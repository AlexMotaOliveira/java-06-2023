package com.impacta.treinamento.cap6.laboratorio;

public class Aluno {

    static int contadorDeAlunos;

    private String nome;

    public Aluno(){

    }

    public Aluno(String nome){

    }

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                "contadorDeAlunos: " + contadorDeAlunos +
                '}';
    }
}
