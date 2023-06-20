package com.impacta.treinamento.cap12.laboratorio;

import com.impacta.treinamento.cap12.laboratorio.model.Pessoa;

public class Cap9_Lab1 {

    public static void main(String[] args) {

        Pessoa manuel = new
                Aluno("Manuel", 38, 'M',
                123456789, "05/02/1985", 2500, "Java");

//        não é visivel fora do packege
//        manuel.nome
//        manuel.idade = 37;
        manuel.heracaMetodoPrivado();



        Aluno alunoManoel = (Aluno) manuel;
        alunoManoel.getCurso();

        String cursoAlunoManoel = ((Aluno) manuel).getCurso();


        Pessoa rafael = new
                Aluno("Rafael", 35, 'M',
                54689, "05/02/1987", 2500, "Java");

        Pessoa professor = new Professor("Alex", 37, 'M',
                1545485, "05/02/1986", 1200, "Linguagem Java");

        System.out.println(professor.falar("Manuel?"));
        System.out.println(manuel.falar("Presente"));
        System.out.println(professor.falar("Rafael?"));
        System.out.println(rafael.falar("Presente"));
        System.out.println();

        manuel.mostrarDados();
        rafael.mostrarDados();
        professor.mostrarDados();

        System.out.println(tipoDaClasse(manuel));
        System.out.println(tipoDaClasse(professor));

    }

    public static String tipoDaClasse(Pessoa pessoa) {
        if (pessoa instanceof Aluno) {
            return "Objeto do tipo Aluno";
        } else {
            return "Objeto do tipo Professor";
        }
    }
}
