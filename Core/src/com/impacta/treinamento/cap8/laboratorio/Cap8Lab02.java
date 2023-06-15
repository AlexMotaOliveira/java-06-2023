package com.impacta.treinamento.cap8.laboratorio;

public class Cap8Lab02 {


    public static void main(String[] args) {

        if (false) {
            System.out.println("if true sem chaves");
        }

        if (args.length > 0) {
            double soma = 0;

            System.out.println("A media das idades: ");

            for (int i = 0; i <= args.length; i++) {
                soma += Double.parseDouble(args[i]);
                System.out.println(args[i]);
            }

            double media = soma / args.length;
            System.out.println("é de: " + media);
        } else {
            System.out.println("Entre com valores válidos para as idades");
        }
    }
}
