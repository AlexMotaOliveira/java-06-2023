package com.impacta.treinamento.cap16;


import java.io.*;

public class ExemploCriacaoArquivoTryResouces {

    public static void main(String[] args) {

        try (InputStream inputStream = new FileInputStream("Arquivo2.txt");
             DataInputStream stream = new DataInputStream(inputStream)) {

            while (stream.available() > 0){
                char caracter = stream.readChar();
                System.out.print(caracter);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
