package com.impacta.treinamento.cap17;

public class MetodoSincronizado {

    synchronized void imprimir(String mensagem){
        System.out.println(mensagem);
    }
}
