package com.impacta.treinamento.cap17;

import javax.swing.*;
import java.util.Scanner;

public class TesteDeadLock {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        JFrame jFrame = new JFrame();

        JOptionPane.showMessageDialog(null, "minha mensagem");

        int valor1 = 0;
        int valor2 = 0;
        while (true) {
            try {
                String texto1 = JOptionPane.showInputDialog(null, "Digite um valor 1:", "Janela 1", JOptionPane.QUESTION_MESSAGE);
                valor1 = Integer.parseInt(texto1);
                String texto2 = JOptionPane.showInputDialog(null, "Digite um valor 2:", "Janela 2", JOptionPane.QUESTION_MESSAGE);
                valor2 = Integer.parseInt(texto2);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        ExemploDeadLock exemploDeadLock = new ExemploDeadLock();

        final int finalValor = valor1;
        final int finalValor1 = valor2;
        Runnable runnable = () -> {
            try {
                exemploDeadLock.read();
                exemploDeadLock.write(finalValor, finalValor1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);

        thread.start();
        thread1.start();
    }
}
