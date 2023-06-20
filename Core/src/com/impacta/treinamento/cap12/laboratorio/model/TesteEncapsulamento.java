package com.impacta.treinamento.cap12.laboratorio.model;

import com.impacta.treinamento.cap12.laboratorio.Aluno;

public class TesteEncapsulamento {

    public static void main(String[] args) {

        Pessoa pessoa = new Aluno();

        // default e protected tem acesso no mesmo pacote
        pessoa.nome = "Alex";
        pessoa.idade = 37;

        pessoa.heracaMetodoPrivado();

    }
}
