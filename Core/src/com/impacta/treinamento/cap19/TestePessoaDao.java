package com.impacta.treinamento.cap19;

import java.sql.SQLException;

public class TestePessoaDao {


    public static void main(String[] args) {

//        String nome = JOptionPane.showInputDialog("Digite seu nome:");
//        String cpf = JOptionPane.showInputDialog("Digite seu cpf:");
//        String telefone = JOptionPane.showInputDialog("digite seu telefone");


//        Pessoa pessoa = new Pessoa(nome, cpf, telefone);
        Pessoa pessoa1 = new Pessoa("Felipe", "33358365633", "13985632147");

        try {
            PessoaDAOStatementImpl pessoaDAOStatementImpl = new PessoaDAOStatementImpl();
//            Pessoa pessoaEntity = new PessoaDAOStatementImpl().save(pessoa1);
//            System.out.println(pessoaEntity);
//            Pessoa pessoaEntity = pessoaDAOStatementImpl.findByCpf("33358365633' or 'A'='A' or '%");
            pessoaDAOStatementImpl.findByAllCpf("33358365633' or 'A'='A' or '%").forEach(System.out::println);
//            Pessoa pessoaEntity2 = PessoaDAO.findById(7);
//            System.out.println(pessoaEntity2);
//            PessoaDAO.findAll().forEach(System.out::println);
//
//            PessoaDAO.deleteById(5);

//            PessoaDAO.update(pessoa1);

//            String senha = JOptionPane.showInputDialog("digite sua senha: ");
//            pessoaDAO.findByNome(senha).forEach(System.out::println);


        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
