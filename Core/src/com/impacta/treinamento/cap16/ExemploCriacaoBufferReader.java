package com.impacta.treinamento.cap16;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploCriacaoBufferReader {

    public static void main(String[] args) {

        try {

            FileReader fileReader = new FileReader("Arquivo5.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }


        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo");
        }

    }
}
