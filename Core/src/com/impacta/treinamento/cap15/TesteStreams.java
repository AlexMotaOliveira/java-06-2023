package com.impacta.treinamento.cap15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TesteStreams {

    public static void main(String[] args) {

        /* Cria uma lista vazia de funcionarios. */
        List<Funcionario> list = new ArrayList<>();

        /* Adiciona alguns funcionarios a lista. */
        list.add(new Funcionario(2005, "Manuel da Silva", "Desenvolvedor", 3580.0));
        list.add(new Funcionario(3018, "Joaquim Batista", "Desenvolvedor", 5500.0));
        list.add(new Funcionario(1045, "Maria das Dores", "Analista", 6250.0));
        list.add(new Funcionario(1780, "João Ricardo", "Desenvolvedor", 7100.0));
        list.add(new Funcionario(5200, "Ana Maria", "Vendedor", 4100.0));
        list.add(new Funcionario(3420, "André de Souza", "Desenvolvedor", 5890.0));
        list.add(new Funcionario(3999, "Robson Gusmão", "Analista", 6500.0));
        list.add(new Funcionario(1920, "Rubens Vieira", "Coordenador", 12300.5));
        list.add(new Funcionario(2389, "Joana Paiva", "Desenvolvedor", 3200.0));
        list.add(new Funcionario(6300, "Joana Paiva", "Atendente", 1350.0));

        list
                .stream()  // em fluxo de dados
//                .sorted((x, y) -> x.getNome().compareTo(y.getNome()))
//                .sorted((x, y) -> x.getMatricula().compareTo(y.getMatricula()))
//                .sorted(Comparator.comparing(Funcionario::getCargo)
//                        .thenComparing(Funcionario::getSalario)
//                        .reversed())
//                .filter(f -> f.getSalario() > 5_000)
//                .sorted(Comparator.comparing(Funcionario::getSalario).reversed())
//                .limit(1)
                .forEach(System.out::println);


        System.out.println("---------------------------------");

        Funcionario funcionarioMaiorSalario =
                list.stream()
                .max((o1, o2) -> o1.getSalario().compareTo(o2.getSalario())).get();
        System.out.println(funcionarioMaiorSalario);

        System.out.println("---------------------------------");

        Funcionario funcionarioMenorSalario =
                list.stream()
                        .min((o1, o2) -> o1.getSalario().compareTo(o2.getSalario())).get();

        System.out.println(funcionarioMenorSalario);

        System.out.println("---------------------------------");
        list.stream()  // em fluxo de dados
                .skip(5)
                .forEach(f -> System.out.println(f));

        System.out.println("---------------------------------");
        Stream<Funcionario> stream = list.stream();

        Stream<Double> mapToList = list.stream().map(funcionario -> funcionario.getSalario());

        Stream<JogadorFutebol> jogadorFutebolStream =
                list.stream()
                        .map(funcionario ->
                                new JogadorFutebol(funcionario.getNome(),
                                        funcionario.getSalario() > 6000 ? "Atacante" : "Zagueiro",
                                        funcionario.getSalario()
                                ));


//        jogadorFutebolStream
//                .sorted(Comparator.comparing(JogadorFutebol::getProfissao)
//                        .reversed()
//                        .thenComparingDouble(JogadorFutebol::getSalario)
//                        .reversed()
//                )
////                .limit(3)
//                .map(JogadorFutebol::getProfissao)
//                .distinct()
//                .forEach(System.out::println);

        long quantidadeAtacantes =
                list.stream()
                        .filter(funcionario ->
                                funcionario.getCargo().equals("Atendente"))
                        .count();

        System.out.println("quantidade de funcioanrios que são atendentes: " + quantidadeAtacantes);

        System.out.println("----------------------------------");
        jogadorFutebolStream
                .sorted((o1, o2) -> o1.compareTo(o2.getSalario()))
                .forEach(System.out::println);


        System.out.println("-------------equals---------------------");

        JogadorFutebol a = new JogadorFutebol("Alex", "Atacante", 7000D);     // @v546654
        JogadorFutebol b = new JogadorFutebol("Alex", "Zagueiro", 3000D);  // @sdf4666
        // false == a.equals(b)
        System.out.println(a.equals(b));

        JogadorFutebol c;     // @sdf4666
        JogadorFutebol d = new JogadorFutebol("Roberto", "Zagueiro", 3000D);  // @sdf4666
        // true mesmo ponteiro, mas vai avaliar o nome
        c = d;

        System.out.println(c.equals(d));

        JogadorFutebol e  = new JogadorFutebol("Alex", "Atacante", 7000D);     // @v546654
        JogadorFutebol f = new JogadorFutebol("Alex", "Zagueiro", 3000D);  // @sdf4666

        // true são objetos diferentes, mas com o mesmo nome
        System.out.println(e.equals(f));

        // todo pausa até as 21:30

    }



}
