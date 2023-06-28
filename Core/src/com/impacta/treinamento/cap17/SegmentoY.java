package com.impacta.treinamento.cap17;

public class SegmentoY extends Thread {

    int montante;

    @Override
    public void run() {
        synchronized (this) {
            String nome = Thread.currentThread().getName();
            System.out.print(nome.concat(" "));
            for (int i = 0; i < 100; i++) {
                montante += i;
                System.out.print(" " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println();
            System.out.print(nome.concat(" "));
            System.out.println("valor total da soma: " + montante);
            super.notify();
        }
    }
}
