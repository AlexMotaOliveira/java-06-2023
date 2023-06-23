package com.impacta.treinamento.cap15;

import com.impacta.treinamento.cap7.Aluno;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteList {

    public static void main(String[] args) {

        String listaSimples[] = new String[10];
        listaSimples[0] = "primeiro item";

        for (String elemento : listaSimples) {
        }

        for (int i = 0; i < listaSimples.length; i++) {
        }

        List<Integer> listaIntegers = new Vector<>();
        List<Aluno> alunos = new LinkedList<>();

        List<String> paises = new ArrayList<>();
        paises.add("Brasil"); // 0
        paises.add("Portugal"); // 1
        paises.add(2, "Italia"); // 2
        paises.add("Inglaterra"); // 3
        paises.add("Estados Unidos"); // 4
        paises.add("França"); // 5
        paises.add("Inglaterra"); // 6
        paises.add("Inglaterra"); // 7

        for (String pais : paises) {
            System.out.println(pais);
        }

        System.out.println("--------------forEach-----------");
        paises.forEach(pais -> {
            if (pais.contains("o")) {
                System.out.println(pais);
            }
        });

        List<Aluno> aluno = new LinkedList<>();
        System.out.println("minha lista contem: " + paises.size() + " paises");
        System.out.println("O index da Inglaterra é: " + paises.indexOf("Inglater"));
        System.out.println(paises.contains("Inglaterra"));
        System.out.println(paises.get(paises.indexOf("Inglaterra")));

        System.out.println("-------------------ordenado------------------------");
        paises.sort((x, y) -> x.compareTo(y));
        paises.sort(String::compareTo);
        paises.forEach(System.out::println);
        paises.remove("Brasil");
        paises.removeIf( pais -> pais.equals("Inglaterra"));

        for (String pais: paises) {
            if(pais.equals("Inglaterra")){
                paises.remove("Inglaterra");
            }
        }




//        paises.clear();

        Set<String> listSet = new TreeSet<>();

        listSet.add("Brasil"); // 0
        listSet.add("Portugal"); // 1
        listSet.add("Italia"); // 2
        listSet.add("Inglaterra"); // 3
        listSet.add("Estados Unidos"); // 4
        listSet.add("França"); // 5
        listSet.add("Inglaterra"); // 6
        listSet.add("Inglaterra"); // 7

        System.out.println("---- lista SET ------------");
        listSet.forEach(System.out::println);

        Iterator<String> iterator = listSet.iterator();

        listSet.stream().sorted();

        System.out.println("---- lista Iterator ------------");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("---- Streams ------------");
//        Stream stream = paises
        paises
                .stream() // nova lista de Streams
                .filter(pais -> pais.contains("a")) // nova lista de Streams só com a condição passada
//                .filter(pais -> pais.contains("o"))
                .sorted()
                        .limit(2)
                .forEach(System.out::println);
    }
}
