package com.impacta.treinamento.cap14;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {

        int numero; // primitivo, não tem nenhum metodo
        Integer integer; // wrapper, deversos metodos
        Integer.parseInt("0");

        String lista[] = new String[0];
        ArrayList<String> listClasseJava = new ArrayList<>();

        listClasseJava.contains(10);

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }

        for (String elemento: lista) {
            System.out.println(elemento);
        }

        listClasseJava.forEach(cadaElemento -> System.out.println(cadaElemento));

        listClasseJava.forEach(cadaElemento -> {
            System.out.println(cadaElemento);
            System.out.println(cadaElemento);
            System.out.println(cadaElemento);
            System.out.println(cadaElemento);
            System.out.println(cadaElemento);
            System.out.println(cadaElemento);
            System.out.println(cadaElemento);
        });
    }


}
