package com.impacta.treinamento.cap11;

import java.io.FileReader;
import java.io.IOException;

public class TesteExceptionVerificada {

    public static void main(String[] args) { //throws IOException {
        try {
            trace();
        } catch (IOException e) {
            System.out.println("não consegui abrir o arquivo");
            System.out.println(e);
            e.printStackTrace();
        }
    }

    static void trace() throws IOException {
        FileReader fileReader = new FileReader("C:\\Java-Try");
    }
}
