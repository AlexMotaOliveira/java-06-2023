package com.impacta.treinamento.cap6.laboratorio;

public class Cap6_Lab2 {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println("sobrecarga de metodos");
        System.out.println("int + int: " + calc.subtrair(1, 1));
        System.out.println("double + double: " + calc.subtrair(10.5, 2.0));
        System.out.println("int + double: " + calc.subtrair(10, 7.50));
        System.out.println("double + int: " + calc.subtrair(10.0, 4));

    }
}
