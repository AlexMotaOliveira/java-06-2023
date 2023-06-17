package com.impacta.treinamento.cap10;

public interface Soma {

    String nome = "Somar";

    int somar(int valor1, int valor2);
    long somar(long valor1, long valor2);

    static double metodoStaticoNaInterface(double valor1, double valor2){
        return metodoPrivadoDaInterface(valor1, valor2);
    }

    default double metodoStaticoNaInterface(long valor1, double valor2){
        return valor1 + valor2;
    }

    private static double metodoPrivadoDaInterface(double valor1, double valor2){
        return valor1 + valor2;
    }

}
