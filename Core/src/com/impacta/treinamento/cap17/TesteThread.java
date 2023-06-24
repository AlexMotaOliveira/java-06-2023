package com.impacta.treinamento.cap17;

public class TesteThread extends Thread {

    private String nome;

    public TesteThread(){}

    public TesteThread(String nome){
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


    public void run(String texto) {
        System.out.println("recebi o texto: " + texto);
    }
}
