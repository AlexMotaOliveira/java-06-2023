package com.impacta.treinamento.cap14;

public class TesteInterfaceFuncional {

    public static void main(String[] args) {

        OperacaoAritimetica soma = new Calculadora();
        double resultado = soma.executar(12.3, 10);
        System.out.println(resultado);

        OperacaoAritimetica somaFuncional = (x, y) -> x + y;
        System.out.println(somaFuncional.executar(12.3, 10));

        OperacaoAritimetica divisaoFuncional = (x, y) -> x / y;
        System.out.println(divisaoFuncional.executar(10, 2));

        OperacaoAritimetica multiplicarFuncional = (valor1, valor2) -> valor1 * valor2;
        System.out.println(multiplicarFuncional.executar(10, 2));

        OperacaoAritimetica exibirDados = (idade, salario) -> idade * salario;


        ExemploFuncional1 funcional = (nome, idade, salario) ->
                System.out.println(
                        "Parabens: " + nome.toUpperCase() +
                                " pelo seus  " + idade +
                                " anos de vida. Seu novo salario e: " + salario);

        funcional.exibirDados("Alex", 37, 100_00);



        OperacaoAritimetica operacaoMetedoReferencia = Calculadora::executarStatic;
        operacaoMetedoReferencia.executar(10, 10);

        ExemploFuncional2 funcional2 = () -> System.out.println("interface sem parametros");
        ExemploFuncional2 funcionalMetodoReferencia = System.out::println;
        funcionalMetodoReferencia.exibirDados();

    }
}
