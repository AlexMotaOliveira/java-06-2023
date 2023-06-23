package com.impacta.treinamento.cap15;

import java.util.*;
import java.util.stream.Collectors;

public class TesteMap {

    public static void main(String[] args) {
        //  key  ,   value
        Map<String, String> map = new HashMap<>();
        map.put("123123123-32", "Alex Mota");
        map.put("999123123-31", "Alex Mota");

        map.containsValue("Alex2");
        map.containsKey("123123123-32");

        Set<String> setKey = map.keySet();
        Collection<String> setValueCallections = map.values();
        Set<String> listValueCollet = map.values().stream().collect(Collectors.toSet());

        map.forEach((key, value) -> {
            System.out.print("chave: " + key);
            System.out.println(" valor: " + value);

        });

        Map<String, String> jogador = new HashMap<>();
        map.put("nome", "Alex Mota");
        map.put("profissao", "Atacante");
        map.put("salario", "7.000");

        /*

        {
            "nome": "Alex Mota",
            "profissao": "Atacante",
            "salario": "7.000"
        }

         */


    }
}
