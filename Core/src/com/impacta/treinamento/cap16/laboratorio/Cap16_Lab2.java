package com.impacta.treinamento.cap16.laboratorio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Cap16_Lab2 {

    private static final String PASTA_ORIGEM = "D:\\java-06-2023\\documentos";
    private static final String PASTA_BACKUP = "D:\\java-06-2023\\backup";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a pasta de origem a ser copiada: ");
        String origem = scanner.nextLine();

//        if (!Pattern.matches("[\\w+]?([\\w+]*[.\\-\\\\\\\\])?[\\w+]+", origem)) {
//            System.out.println("nome invalido do diretorio");
//            return;
//        }

        System.out.println("digite a pasta de destino do backup: ");
        String backup = scanner.nextLine();

        Path origemPath = Paths.get(origem);
        Path backupPath = Paths.get(backup);

        try {
            if (!Files.isDirectory(backupPath)) {
                Files.createDirectory(backupPath);
            }
            Stream<Path> streamOrigem = Files.list(origemPath);

            streamOrigem.forEach(arquivo -> {
                try {
                    Path destino = backupPath.resolve(arquivo.getFileName());
                    if (!Files.exists(destino)) {
                        Files.copy(arquivo, destino);
                        System.out.println("arquivo copiada para o destino: " + destino.toAbsolutePath());
                    } else {
                        System.out.println("arquivo já existe no destino: " + destino.toAbsolutePath());
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                // TODO: 23/06/2023 pausa até 21:25
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
