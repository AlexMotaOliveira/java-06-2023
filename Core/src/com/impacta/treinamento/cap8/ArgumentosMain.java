package com.impacta.treinamento.cap8;

public class ArgumentosMain {

    public static void main(String[] elementos) {

        long soma = 0;
        for (String elemeto : elementos) {
            Integer inteiro = Integer.valueOf(elemeto);
            Long aLong = Long.valueOf(elemeto);
            soma += inteiro + aLong;
        }
        System.out.println("valor da soma: " + soma);
    }
}
