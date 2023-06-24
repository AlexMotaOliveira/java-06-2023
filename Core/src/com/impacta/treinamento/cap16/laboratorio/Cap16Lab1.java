package com.impacta.treinamento.cap16.laboratorio;

import java.io.*;
import java.util.Scanner;

public class Cap16Lab1 {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("digite o nome do arquivo:");
            String arquivo = scanner.nextLine();

            System.out.println("Escreva o seu texto:");
            String texto = scanner.nextLine();

            escrever(arquivo, texto);
            System.out.println("**************************************");
            ler(arquivo);

        } catch (RuntimeException e) {
            System.out.println(e);
        }


    }


    private static void escrever(String arquivo, String texto) {
        try (FileOutputStream file = new FileOutputStream(arquivo);
             DataOutputStream dados = new DataOutputStream(file)) {
            dados.writeChars(texto);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void ler(String arquivo) {
        try (FileInputStream file = new FileInputStream(arquivo);
             DataInputStream dados = new DataInputStream(file)) {

            while (dados.available() > 0) {
                char caracter = dados.readChar();
                System.out.print(caracter);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }


}
