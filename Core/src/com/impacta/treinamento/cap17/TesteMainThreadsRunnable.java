package com.impacta.treinamento.cap17;

public class TesteMainThreadsRunnable {


    public static void main(String[] args) throws InterruptedException {

        runnable(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Runnable runnable1 = new TesteRunnable("A");
        Thread thread1 = new Thread(runnable1);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();

        Runnable runnable2 = new TesteRunnable("B");
        Thread thread2 = new Thread(runnable2);
        thread2.start();

        Runnable runnable3 = new TesteRunnable("C");
        Thread thread3 = new Thread(runnable3);
        thread3.start();


        System.out.println(Thread.currentThread().getName() + "- main");
    }

    static void runnable(Runnable runnable) throws InterruptedException {
        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();
    }

}
