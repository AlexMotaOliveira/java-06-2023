package com.impacta.treinamento.cap17;

public class ContaBancaria {

    private long saldo = 500;

    public long getSaldo() {
        return saldo;
    }

    public boolean sacar(long valorSaque) {
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

    public synchronized long sacarReturnSaldo(long valorSaque) {
        sacar(valorSaque);
        return getSaldo();
    }

}
