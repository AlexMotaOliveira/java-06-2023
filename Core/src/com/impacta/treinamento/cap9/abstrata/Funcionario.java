package com.impacta.treinamento.cap9.abstrata;

public class Funcionario extends Pessoa{


    @Override
    void falar(String fala) {
        System.out.println("...: " + fala);
    }

    @Override
    void locomover(String locomocao) {
        System.out.println("...: " + locomocao);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }
}
