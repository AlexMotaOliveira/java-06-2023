package com.impacta.treinamento.cap11.laboratorio;

import java.util.Scanner;

public class ExercicioIdade {


    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o seu ano de nascimento:");
            String valor = scanner.nextLine();

            int ano = Integer.parseInt(valor);
            int idade = 2023 - ano;

            System.out.println("Sua idade é: " + idade);
        } catch (NumberFormatException e) {
            System.out.println("Valor digitado inválido: " + e.getMessage());
        }

    }
}
