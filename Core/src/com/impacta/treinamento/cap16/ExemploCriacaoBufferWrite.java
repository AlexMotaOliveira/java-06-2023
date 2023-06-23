package com.impacta.treinamento.cap16;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ExemploCriacaoBufferWrite {

    public static void main(String[] args) throws IOException {

        try (FileWriter fileWriter = new FileWriter("Arquivo5.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {

            for (int i = 0; i < 10; i++) {
                bufferedWriter.write("meu segundo arquivo " + i);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();


        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo");
        }

    }
}
