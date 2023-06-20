package com.impacta.treinamento.cap14;

public class Calculadora implements OperacaoAritimetica{

    @Override
    public double executar(double valor1, double valor2) {
        return valor1 + valor2;
    }


    public static double executarStatic(double v, double v1) {
        return v + v1;
    }
}
