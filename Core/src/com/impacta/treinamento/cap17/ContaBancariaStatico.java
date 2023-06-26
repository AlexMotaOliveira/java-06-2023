package com.impacta.treinamento.cap17;

public class ContaBancariaStatico {

    private static long saldo = 500;

    public static long getSaldo() {
        return saldo;
    }

    public static boolean sacar(long valorSaque) {
        if (valorSaque <= saldo) { // 300 <= 500
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            saldo -= valorSaque;
            return true;
        }
        return false;
    }

    public long sacarReturnSaldo(long valorSaque) {
        sacar(valorSaque);
        return getSaldo();
    }

}
