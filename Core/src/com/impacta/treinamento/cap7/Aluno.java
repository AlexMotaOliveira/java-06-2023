package com.impacta.treinamento.cap7;

public class Aluno {

    static int contadorDeAlunos;

    private String nome;

    // default
    public Aluno() {

    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, int contadorDeAlunos) {
        this.nome = nome;
        this.contadorDeAlunos = contadorDeAlunos;
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
