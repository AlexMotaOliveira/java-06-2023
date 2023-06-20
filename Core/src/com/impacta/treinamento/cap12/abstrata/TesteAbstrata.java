package com.impacta.treinamento.cap12.abstrata;

public class TesteAbstrata {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("");
        funcionario.setNome("");

        funcionario.falar("gritarrrrr");
        funcionario.locomover("correr");

        Quadrado quadrado = new Quadrado(20);
        quadrado.calcularArea();
    }
}
