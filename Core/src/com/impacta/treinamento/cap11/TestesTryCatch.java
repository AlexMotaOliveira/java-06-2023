package com.impacta.treinamento.cap11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestesTryCatch {


    public static void main(String[] args) {

        int resultado = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero..");
//        String valor = scanner.nextLine();

        int valor = 0;

        try {

            valor = scanner.nextInt();
//            resultado = 10 / Integer.parseInt(valor);
            setException(valor);
            resultado = 10 / valor;
            System.out.println("o resultado é: " + resultado);

        } catch (ArithmeticException e) {
//            System.out.println(e.getCause());
//            System.out.println(e.getMessage());
//            System.out.println(e.getStackTrace().toString());
//            System.out.println(e.getClass());

            System.out.println("ERRO: não é possivel dividir por Zero: " + e);

        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("ERRO: Digite um numero valido, não coloque letras e caracteres especias: " + valor);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim do metodo main");

    }

    static void setException(int valor) {
        if (valor == 10) {
            throw new RuntimeException("minha excessão");
        }else {
            System.out.println("valor é diferente de 10");
        }
    }
}
