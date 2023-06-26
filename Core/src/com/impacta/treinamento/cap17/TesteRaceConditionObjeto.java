package com.impacta.treinamento.cap17;

public class TesteRaceConditionObjeto {

    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();

        Runnable caixaEletronico = () -> {
            // intancia de classe ou a classe
            synchronized (contaBancaria) {
                int valorSaque = 200;
                long validacao = contaBancaria.sacarReturnSaldo(valorSaque);
                String nomeThread = Thread.currentThread().getName();
                if (validacao > 0) {
                    System.out.println(nomeThread + "- valor saque: R$" + valorSaque);
                    System.out.println(nomeThread + "- Saldo atual: R$" + contaBancaria.getSaldo());
                } else {
                    System.out.println(nomeThread + "- valor insuficiente para saque: " + contaBancaria.getSaldo());
                }
            }
        };

        Thread sacandoValor = new Thread(caixaEletronico);
        Thread sacandoValor2 = new Thread(caixaEletronico);
        Thread sacandoValor3 = new Thread(caixaEletronico);


        sacandoValor.start();
        sacandoValor2.start();
        sacandoValor3.start();
    }
}
