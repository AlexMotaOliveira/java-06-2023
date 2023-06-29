package com.impacta.treinamento.cap19;

import javax.swing.*;
import java.sql.SQLException;

public class TestePessoaDao {


    public static void main(String[] args) {

//        String nome = JOptionPane.showInputDialog("Digite seu nome:");
//        String cpf = JOptionPane.showInputDialog("Digite seu cpf:");
//        String telefone = JOptionPane.showInputDialog("digite seu telefone");


//        Pessoa pessoa = new Pessoa(nome, cpf, telefone);
        Pessoa pessoa1 = new Pessoa("Joana", "11158365658", "13985632147");

        try {
            PessoaDAO pessoaDAO = new PessoaDAO();
//            Pessoa pessoaEntity = new PessoaDAO2().save(pessoa1);
//            System.out.println(pessoaEntity);
//            Pessoa pessoaEntity = PessoaDAO.findByCpf(pessoa.getCpf());
//            System.out.println(pessoaEntity);
//            Pessoa pessoaEntity2 = PessoaDAO.findById(7);
//            System.out.println(pessoaEntity2);
//            PessoaDAO.findAll().forEach(System.out::println);
//
//            PessoaDAO.deleteById(5);

//            PessoaDAO.update(pessoa1);

            pessoaDAO.findByNome("Chi");



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
