package com.impacta.treinamento.cap15;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Set;


public class MegasenaUtilitarioTest {


    @Test
    @Order(7)
    void jogoMegaSenaTest2() {

        Set<Integer> lista = SorteadorDeNumeros.jogoMegaSena();
        Assertions.assertTrue(lista.size() == 6, "quantidade de numeros para o jogo invalido: " + lista.size());

        lista.forEach(numero -> {
            Assertions.assertTrue(numero > 0, "numero invalido: " + numero);
            Assertions.assertTrue(numero <= 60, "numero invalido:  " + numero);
            imprimirOteste(numero);
        });
    }

    private void imprimirOteste(int numero) {
        System.out.println(numero);
    }

}
