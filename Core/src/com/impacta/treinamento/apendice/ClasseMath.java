package com.impacta.treinamento.apendice;

public class ClasseMath {


    public static void main(String[] args) {


        long numero = 10;
//
//        System.out.println(Math.abs(-10));
//        System.out.println(Math.abs(10.0D));

        Math.max(numero, 96);
        Math.min(numero,2);

        System.out.println(Math.ceil(10.1D));
        System.out.println(Math.ceil(10.6D));
        System.out.println(Math.ceil(10.9D));


        System.out.println(Math.floor(10.1D));
        System.out.println(Math.floor(10.6D));
        System.out.println(Math.floor(10.9D));

        System.out.println(Math.round(10.1D));
        System.out.println(Math.round(10.4D));
        System.out.println(Math.round(10.9D));

        System.out.println(Math.sqrt(21));

        Math.random();

    }
}
