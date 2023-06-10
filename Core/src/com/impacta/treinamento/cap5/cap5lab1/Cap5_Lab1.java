package com.impacta.treinamento.cap5.cap5lab1;

public class Cap5_Lab1 {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Alex";
        funcionario.sobrenome = "Mota";
        funcionario.cargo = "Instrutor";
        funcionario.salario = 50_000d;

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Sobrenome: " + funcionario.sobrenome);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Salario: " + funcionario.salario);
    }
}
