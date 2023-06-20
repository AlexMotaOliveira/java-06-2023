package com.impacta.treinamento.cap10;

public class Televisao implements Eletrodomestico {


    @Override
    public void ligar() {
        System.out.println("ligando a televisão");
    }

    @Override
    public void desligar() {
        System.out.println("desligando a televisão");
    }
}
