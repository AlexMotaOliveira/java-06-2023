package com.impacta.treinamento.cap5;


import java.util.List;

public class Exemplo {

    public static void main(String[] args) {

        String texto ="texto qualque";
        int idade = 10;
        idade = 15;

        Pessoa pessoa = new Pessoa();

        System.out.println(pessoa.getNome());
        pessoa.setNome("Alex");
//        pessoa.idade = 37;
//        pessoa.nacionalidade = "brasileiro";
        System.out.println("depois de atribuir");
        System.out.println(pessoa.getNome());

        Pessoa pessoa1 = new Pessoa("João", 15, "brasileiro");
        System.out.println("criação com o construtor: " + pessoa1.getNome());

        com.impacta.treinamento.cap5.pacotes.Pessoa pessoa2 = new com.impacta.treinamento.cap5.pacotes.Pessoa();
//        pessoa2.nome = "Maria";
        System.out.println("criação com o construtor: " + pessoa2.getNome());
        pessoa2.setNome("Maria");
        System.out.println("criação com o construtor: " + pessoa2.getNome());
    }
}
