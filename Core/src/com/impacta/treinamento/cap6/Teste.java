package com.impacta.treinamento.cap6;


import com.impacta.treinamento.cap5.Pessoa;

public class Teste {

    public static void main(String[] args) {

        Metodos metodos = new Metodos();

        metodos.somar(10L, 10L);
        metodos.somar(Long.valueOf(10), Long.valueOf(20));

//        metodos.exibirNoTerminal("usando o metodo da classe Metodos");
//

//        long valor1 = 10;
//        valor1 = 30;
//        long valor2 = 20;
//        Long soma = metodos.somar(10, 20);
//        metodos.somar(10, 20);
//        metodos.exibirNoTerminal("soma do metodo Soma: " + soma);
//        metodos.exibirNoTerminal("soma do metodo Soma: " + metodos.somar(valor1, valor2));
//        metodos.exibirNoTerminal(" retorno do metodo: " + metodos.trocarValor(valor1)); // copia do valor da variavel
//        metodos.exibirNoTerminal("valor da variavel valor1 : " + valor1);
//
        Pessoa pessoa = new Pessoa("Alex", 23, "brasil");
        Pessoa pessoa1 = new Pessoa("Maria", 23, "brasil");

        metodos.exibirNoTerminal(pessoa);
        metodos.exibirNoTerminal(pessoa1);
//
//        metodos.exibirNoTerminal("o objeto pessoa foi alterado?");
//        metodos.trocarValorString(pessoa);
//        metodos.exibirNoTerminal("objeto pessoa original: " + pessoa.getNome());
//        pessoa = metodos.trocarValorString(pessoa);
//        metodos.exibirNoTerminal("objeto após reatribuir os valores: " + pessoa.getNome());

        Cao cao = new Cao();
        metodos.exibirNoTerminal(cao.falar("latindo"));
        Gato gato = new Gato();
        metodos.exibirNoTerminal(gato.falar("miando"));

        // Thread synchronized metodos.exibirNoTerminal("Alex");
        // Thread  metodos.exibirNoTerminal("Maria");
        // Maria

        Metodos metodos1 = new Metodos();

        System.out.println(metodos1.somar(10, 20));

        System.out.println(Metodos.somar(10, 20,10));
        System.out.println();

        System.out.println("!valor PI_static: " + Metodos.PI_static);
        System.out.println("!valor PI instancia da classe: " + metodos1.getPI());
        System.out.println(Metodos.calcularAreadoCirculo(5));

        System.out.println("valores de Pi apos a alteração");

        System.out.println("!valor PI_static: " + Metodos.PI_static);
        System.out.println("!valor PI instancia da classe: " + metodos1.getPI());
        System.out.println(Metodos.calcularAreadoCirculo(5));

        metodos1.nome = "calcular";


    }
}
