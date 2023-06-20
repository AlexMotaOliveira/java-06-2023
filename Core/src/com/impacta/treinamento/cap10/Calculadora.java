package com.impacta.treinamento.cap10;

public class Calculadora implements Soma, Subtrair {


    @Override
    public int somar(int valor1, int valor2) {
        return valor1 + valor2;
    }

    @Override
    public long somar(long valor1, long valor2) {
        return 0;
    }

    @Override
    public int subtrair(int valor1, int valor2) {
        return valor1 + valor2;
    }

    @Override
    public double metodoStaticoNaInterface(long valor1, double valor2) {
        return valor1 * valor2;
    }
}
