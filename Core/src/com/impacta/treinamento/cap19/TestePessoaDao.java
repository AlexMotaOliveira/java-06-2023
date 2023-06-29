package com.impacta.treinamento.cap19;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestePessoaDao {


    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Chico", "12358365658", "13985632147");

        try {
            PessoaDAO.salvar(pessoa);
//            Pessoa pessoaEntity = PessoaDAO.buscar(pessoa);
//            System.out.println(pessoaEntity);
//            Pessoa pessoaEntity = PessoaDAO.buscar(7);
//            System.out.println(pessoaEntity);

//            PessoaDAO.buscar().forEach(System.out::println);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
