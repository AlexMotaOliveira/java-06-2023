package com.impacta.treinamento.cap17;

public class TesteMainThreads {


    public static void main(String[] args) throws InterruptedException {


        Thread thread = new TesteThread("A");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();

        Thread thread2 = new TesteThread("B");
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.start();

        Thread thread3 = new TesteThread("C");
        thread3.setPriority(Thread.MIN_PRIORITY);
        thread3.start();

        Thread thread4 = new TesteThread("D");
        thread4.setPriority(Thread.MIN_PRIORITY);
        thread4.start();

        Thread thread5 = new TesteThread("E");
        thread5.setPriority(Thread.MIN_PRIORITY);
        thread5.start();


        Thread.sleep(9000);
        thread.start();
        System.out.println(Thread.currentThread().getName() + "- main");
    }
}
