package com.impacta.treinamento.cap5;

public class Pessoa {

    // atributos -> molde
    private String nome;
    private int idade;
    private String nacionalidade;

    //construtor -> contruir o molde
    Pessoa() {

    }

    //João
    public Pessoa(String nome, int idade, String nacionalidade) {
        this.nome = this.setNome(nome);
        this.idade = idade;
        setNacionalidade(nacionalidade);
    }

    //metodos -> comportamentos
    public void getAlgo() {

    }

    public String getNome() {
        return this.nome;
    }

    public String setNome(String nome) {
        return this.nome = "_" + nome.toUpperCase();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade.toUpperCase();
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", nacionalidade='" + nacionalidade + '\'' +
                '}';
    }
}
