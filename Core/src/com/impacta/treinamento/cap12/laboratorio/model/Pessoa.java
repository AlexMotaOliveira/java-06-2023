package com.impacta.treinamento.cap12.laboratorio.model;

import com.impacta.treinamento.cap12.laboratorio.RG;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;
    protected RG rg;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, char sexo, RG rg) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.rg = rg;
    }

    public Pessoa(String nome, int idade, char sexo, int numero, String dataNasc) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.rg = new RG(numero, dataNasc);
    }

    public abstract String falar(String fala);

    public abstract void mostrarDados();

    public String getNome() {
        // não é possivel alterar o valor da variavel depois de atribuido
//        final String nomeFinal = nome;
//        nomeFinal = "";
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public RG getRg() {
        return rg;
    }

    public void setRg(RG rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", rg=" + rg +
                '}';
    }

    public final void heracaMetodoPrivado() {

    }
}
