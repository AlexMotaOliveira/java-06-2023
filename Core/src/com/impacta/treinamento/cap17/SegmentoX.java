package com.impacta.treinamento.cap17;

public class SegmentoX {


    public static void main(String[] args) {

        SegmentoY thread = new SegmentoY();
        thread.start();

        String nome = Thread.currentThread().getName();
        synchronized (thread) {
            try {
                System.out.println(nome + " Aguardando a execução da thread y");
                thread.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(nome.concat(" "));
        System.out.println("acabou a execução, valor total da soma: " + thread.montante);
    }
}
