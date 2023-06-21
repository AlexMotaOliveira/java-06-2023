package com.impacta.treinamento.cap15;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class SorteadorDeNumeros {
    public static int sortear(int numero) {
        Random random = new Random();
        return random.nextInt(numero) + 1; // 1 a 60
    }

    public static Set<Integer> jogoMegaSena() {
        Set<Integer> list = new LinkedHashSet<>();

        while (list.size() < 6) {
            list.add(sortear(60));
        }
        return list;
    }
}
