package com.impacta.treinamento.cap16;


import java.io.*;

public class ExemploCriacaoArquivoTryResouces {

    public static void main(String[] args) {

        try (InputStream inputStream = new FileInputStream("Arquivo2.txt");
             DataInputStream stream = new DataInputStream(inputStream)) {

            while (true){
                char caracter = stream.readChar();
                System.out.println(caracter);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
