package com.impacta.treinamento.cap19;

public class TestePessoaDaoPrepered {


    public static void main(String[] args) {

//        String nome = JOptionPane.showInputDialog("Digite seu nome:");
//        String cpf = JOptionPane.showInputDialog("Digite seu cpf:");
//        String telefone = JOptionPane.showInputDialog("digite seu telefone");


//        Pessoa pessoa = new Pessoa(nome, cpf, telefone);
        Pessoa pessoa1 = new Pessoa("Jose Silva Santos", "45658365633", "13985632147");

        try {
            PessoaDAOPreparedStatementImpl pessoaDAOPreparedStatement = new PessoaDAOPreparedStatementImpl();
//            Pessoa pessoaEntity = pessoaDAOStatementImpl.save(pessoa1);
//            System.out.println(pessoaEntity);
            Pessoa pessoaEntity1 = pessoaDAOPreparedStatement.findByCpf("33358365633' or 'A'='A' or '%");
            System.out.println(pessoaEntity1);
//            Pessoa pessoaEntity2 = pessoaDAOStatementImpl.findById(14);
//            System.out.println(pessoaEntity2);
//            pessoaDAOStatementImpl.findAll().forEach(System.out::println);
//
//            pessoaDAOStatementImpl.deleteById(11);
//
//            pessoaDAOStatementImpl.update(pessoa1);

//            String senha = JOptionPane.showInputDialog("digite sua senha: ");
//            pessoaDAOStatementImpl.findByNome("c").forEach(System.out::println);
//
//            Pessoa pessoa = pessoaDAOStatementImpl.update(pessoa1);
//            System.out.println(pessoa);


        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
