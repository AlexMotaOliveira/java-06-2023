package com.impacta.treinamento.cap16;

import java.io.*;

public class ExemploCriacaoArquivo {

    public static void main(String[] args) {

        try {
            String file = "Arquivo2.txt";
            FileOutputStream arquivo = new FileOutputStream(file, true);
            DataOutputStream dados = new DataOutputStream(arquivo);
            dados.writeBytes("meu segundo arquivo 3");

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não criado");
        } catch (IOException e) {
            System.out.println("não foi possivel escrever dentro do arquivo");
        }
    }
}
