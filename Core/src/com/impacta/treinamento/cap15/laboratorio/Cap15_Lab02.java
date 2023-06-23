package com.impacta.treinamento.cap15.laboratorio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cap15_Lab02 {

    public static void main(String[] args) {

        List<Estudante> estudanteList = new ArrayList<>();

        Estudante joana = new Estudante("Joana", 8.5D, 8.5D);
        Estudante antonio = new Estudante("Antonio", 6D, 9D);
        Estudante mariana = new Estudante("Mariana", 7.5D, 9D);
        Estudante ricardo = new Estudante("Ricardo", 7D, 6D);
        Estudante gustavo = new Estudante("Gustavo", 9.5D, 10D);

        estudanteList.add(joana);
        estudanteList.add(antonio);
        estudanteList.add(mariana);
        estudanteList.add(ricardo);
        estudanteList.add(gustavo);

        estudanteList.add(new Estudante("Marcelo", 10D, 10D));

//        estudanteList.forEach(estudante -> {
////            estudante.setMedia((estudante.getNotaMatematica() + estudante.getNotaPortugues()) / 2);
////            double media = (estudante.getNotaMatematica() + estudante.getNotaPortugues()) / 2;
//            double soma = estudante.getNotaMatematica() + estudante.getNotaPortugues();
//            double media =  soma / 2;
//            estudante.setMedia(media);
//        });

//        estudanteList.forEach(estudante -> estudante.getMedia());
//        estudanteList.forEach(Estudante::getMedia); // medodo de referencia

        estudanteList.forEach(System.out::println);

    }
}
