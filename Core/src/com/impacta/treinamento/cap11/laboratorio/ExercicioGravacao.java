package com.impacta.treinamento.cap11.laboratorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioGravacao {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma frase qualquer: ...");
            String texto = scanner.nextLine();

            PrintWriter writer = new PrintWriter("doc.txt");
            writer.println(texto);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } catch (IOException e) {
            System.out.println("Falha ao gravar as informações digitadas");
        }
    }
}
