package com.impacta.treinamento.cap9;

public class TesteComposicao {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        empresa.nome = "Teste";
        empresa.funcionario = new Funcionario("Alex", "123123123-12");
        empresa.funcionario.setSalario(10000D);
        empresa.funcionario.setMatricula("ST13212");



        System.out.println();

        empresa.cliente = new Cliente("João", "123123123-69","rua um");

//        System.out.println(Empresa.pessoa.toString());

    }
}
