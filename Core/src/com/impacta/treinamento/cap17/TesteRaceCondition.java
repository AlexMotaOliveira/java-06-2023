package com.impacta.treinamento.cap17;

public class TesteRaceCondition {

    public static void main(String[] args) {

//        ContaBancaria contaBancaria = new ContaBancaria();

        Runnable caixaEletronico = () -> {
            // intancia de classe ou a classe
            synchronized (ContaBancariaStatico.class) {
                int valorSaque = 200;
                boolean validacao = ContaBancariaStatico.sacar(valorSaque);
                String nomeThread = Thread.currentThread().getName();
                if (validacao) {
                    System.out.println(nomeThread + "- valor saque: R$" + valorSaque);
                    System.out.println(nomeThread + "- Saldo atual: R$" + ContaBancariaStatico.getSaldo());
                } else {
                    System.out.println(nomeThread + "- valor insuficiente para saque: " + ContaBancariaStatico.getSaldo());
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
