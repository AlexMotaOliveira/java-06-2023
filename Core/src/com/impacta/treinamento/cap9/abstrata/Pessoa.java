package com.impacta.treinamento.cap9.abstrata;

public abstract class Pessoa {

    private String nome;
    private String cpf;

    abstract void falar(String fala);
    abstract void locomover(String locomocao);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
