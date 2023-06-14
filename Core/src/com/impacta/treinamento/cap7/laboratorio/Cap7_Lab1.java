package com.impacta.treinamento.cap7.laboratorio;

public class Cap7_Lab1 {

    public static void main(String[] args) {

        Cadastro cadastro = new Cadastro();
//        cadastro.setNome("Contrutor padrão");
        cadastro.mostrar();

        Cadastro cadastro1 = new Cadastro("Claudio", "Abreu");
        cadastro1.mostrar();

        Cadastro cadastro2 = new Cadastro("Lourdes", "Souza", 60);
        cadastro2.mostrar();

    }
}
