package com.impacta.treinamento.cap5.pacotes;

public class Pessoa {

    // atributos -> molde
    private String nome;
    int idade;
    String nacionalidade;

    //construtor -> contruir o molde
    public Pessoa(){

    }
                        //João
    public Pessoa(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    //metodos -> comportamentos
    public void getAlgo(){

    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = "_OutroPessoa_" + nome.toUpperCase() ;
    }

}
