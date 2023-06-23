package com.impacta.treinamento.cap16;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemplosPath {

    public static void main(String[] args) {

        try {

            Path path = Paths.get("D:\\java-06-2023\\novo_Diretorio");
            if (!Files.exists(path)) {
                Files.createDirectory(path);
            }

            Path arquivo = Paths.get("D:\\java-06-2023\\arquivos_textos\\Arquivo5.txt");

            if (Files.exists(arquivo)) {
                System.out.println(Files.size(arquivo));
                System.out.println(arquivo);
                System.out.println(arquivo.toAbsolutePath());
                System.out.println(arquivo.getFileName());
                System.out.println(arquivo.getParent());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
