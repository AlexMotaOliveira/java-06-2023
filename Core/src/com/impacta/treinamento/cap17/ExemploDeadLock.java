package com.impacta.treinamento.cap17;

public class ExemploDeadLock {

    private Recurso recursoX = new Recurso();
    private Recurso recursoY = new Recurso();

    public int read() throws InterruptedException {
        synchronized (recursoX) {
            Thread.sleep(1000);
            synchronized (recursoY) {
                System.out.println("entou no Read");
                return recursoY.value + recursoX.value;
            }
        }
    }

    public void write(int x, int y) throws InterruptedException {
        synchronized (recursoY) {
            Thread.sleep(1000);
            synchronized (recursoX) {
                System.out.println("entrou no write");
                recursoX.value = x;
                recursoY.value = y;
            }
        }
    }

    private static class Recurso {
        private int value;
    }
}
