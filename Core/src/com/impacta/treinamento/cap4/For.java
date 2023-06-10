package com.impacta.treinamento.cap4;

public class For {

    public static void main(String[] args) {

//      inicialização da variavel // validação da condição// incremento/decremento
//        for (int valor1 = 1; valor1 <= 10; valor1 += 2) {
//            System.out.println("O valor é: " + valor1);
//        }
//
//        for (int valor1 = 1, valor2 = 1; (valor1 <= 10) && (valor2 <= 10); valor1 += 2) {
//            System.out.println("O valor é: " + valor1);
//        }
//
//        int valor = 10;
//        for (; valor < 100; valor += 20) {
//            System.out.println("O valor é: " + valor);
//        }

        for (int valor1 = 1; (valor1 <= 10); valor1 += 2) {
            for (int valor2 = 1; (valor2 <= 10); valor2 += 2) {
                System.out.println(valor2);
                if (valor2 == 9){
                    continue;
                }
                System.out.print("-");
            }

        }
    }
}
