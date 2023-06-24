package com.impacta.treinamento.cap17;

public class TesteRunnable implements Runnable {

    private String nome;

    public TesteRunnable(){}
    public TesteRunnable(String nome){
        this.nome = nome;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + " - " + nome);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
