package com.impacta.treinamento.cap13;

import java.util.Random;

public class MegasenaUtilitario {

    public static int sortearNumero() {
        Random random = new Random();
        int numero = random.nextInt(60) + 1; // 0 a 59 | 0 + 1 = 1 || 59 + 1 = 60
        return numero;
    }
}
