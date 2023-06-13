package com.impacta.treinamento.cap6;

public class Soma extends Metodos{

    @Override
    double somar(Long valor1, Long valor2) {
        return valor1 + valor2;
    }

    @Override
    public long somar(long valor1, long valor2) {
        return super.somar(valor1, valor2);
    }
}
