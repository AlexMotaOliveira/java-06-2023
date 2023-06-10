package com.impacta.treinamento.cap6;

public class Teste {

    public static void main(String[] args) {

        Metodos metodos = new Metodos();
        metodos.exibirNoTerminal("usando o metodo da classe Metodos");

        Long soma = metodos.somar(10, 20);
        metodos.exibirNoTerminal("soma do metodo Soma: " + soma);

    }
}
