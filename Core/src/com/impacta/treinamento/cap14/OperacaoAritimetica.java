package com.impacta.treinamento.cap14;

public interface OperacaoAritimetica {

    // interface funcional tem que ter somente um metodo abstrato
    double executar(double valor1, double valor2);


    default double executar(int valor1, int valor2){
        return 10;
    }

    default double executar(long valor1, int valor2){
        return 10;
    }


}
