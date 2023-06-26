package com.impacta.treinamento.cap17.laboratorio;

public class ThreadLab extends Thread {

    private static Object lock = new Object();


    public ThreadLab(String nome) {
        super(nome);
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(500);
                    String nome = Thread.currentThread().getName();
                    System.out.println(nome + toString());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(e);
                }
            }
        }
    }

    @Override
    public String toString() {
        return " " + hashCode();
    }

}
