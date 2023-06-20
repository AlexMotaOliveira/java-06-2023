package com.impacta.treinamento.cap10;

public class Geladeira implements Eletrodomestico {

    @Override
    public void ligar() {
        System.out.println("ligando a geladeira");

    }

    @Override
    public void desligar() {
        System.out.println("desligando a geladeira");
    }
}
