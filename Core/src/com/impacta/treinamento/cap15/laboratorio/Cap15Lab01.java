package com.impacta.treinamento.cap15.laboratorio;

import java.util.HashMap;
import java.util.Map;

public class Cap15Lab01 {

    public static void main(String[] args) {


        Map<String, Integer> pessoaMap = new HashMap<>();
        pessoaMap.put("Alex", 25);
        pessoaMap.put("Maria", 30);
        pessoaMap.put("Jose", 50);
        pessoaMap.put("Rafael", 15);

        System.out.println("Alex: " + pessoaMap.get("Alex"));
        System.out.println("Maria: " + pessoaMap.get("Maria"));
        System.out.println("Jose: " + pessoaMap.get("Jose"));
        System.out.println("Rafael: " + pessoaMap.get("Rafael"));

        System.out.println("----------lambda--------------");

        pessoaMap
                .forEach((nome, idade) -> System.out.println(nome + ": " + idade));

    }
}
