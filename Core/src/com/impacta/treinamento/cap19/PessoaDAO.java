package com.impacta.treinamento.cap19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

    private static final String schema = "impacta";
    private static final Connection connection = conectar();
    private static final Statement statement = criarStatement();

    public static void salvar(Pessoa pessoa) throws SQLException {
        if (buscar(pessoa) == null) {
            String query = "INSERT INTO pessoa (NOME, CPF, TELEFONE) VALUES (" +
                    "'" + pessoa.getNome() + "'," +
                    "'" + pessoa.getCpf() + "'," +
                    "'" + pessoa.getTelefone() + "' );";
            System.out.println(query);
            int valor = statement.executeUpdate(query);
            if (valor > 0) {
                System.out.println("salvo com sucesso!!!!");
            } else {
                System.out.println("não foi possivel salvar o objeto");
            }
        } else {
            System.out.println("Cpf já existe no banco");
        }
    }

    void alterar(Pessoa pessoa) {

    }

    void apagar(Pessoa pessoa) {

    }

    public static List<Pessoa> buscar() throws SQLException {
        String query = "SELECT * FROM pessoa;";

        ResultSet resultSet = statement.executeQuery(query);

        List<Pessoa> pessoas = new ArrayList<>();
        while (resultSet.next()) {

            int id = resultSet.getInt("ID");
            String nome = resultSet.getString("NOME");
            String cpf = resultSet.getString("CPF");
            String telefone = resultSet.getString("TELEFONE");

            Pessoa pessoaEntity = new Pessoa(id, nome, cpf, telefone);
            pessoas.add(pessoaEntity);
        }
        return pessoas;
    }

    public static Pessoa buscar(int primaryKey) throws SQLException {
        String query = "SELECT * FROM pessoa WHERE id = " + primaryKey;

        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {

            int id = resultSet.getInt("ID");
            String nome = resultSet.getString("NOME");
            String cpf = resultSet.getString("CPF");
            String telefone = resultSet.getString("TELEFONE");

            return new Pessoa(id, nome, cpf, telefone);
        }
        return null;
    }

    public static Pessoa buscar(Pessoa pessoa) throws SQLException {
        String query = "Select * FROM pessoa WHERE (`CPF` = '" + pessoa.getCpf() + "');";

        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {

            int id = resultSet.getInt("ID");
            String nome = resultSet.getString("NOME");
            String cpf = resultSet.getString("CPF");
            String telefone = resultSet.getString("TELEFONE");

            return new Pessoa(id, nome, cpf, telefone);
        }
        return null;
    }

    private static Connection conectar() {
        try {
            return ConexaoFactory.conectar(schema);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static Statement criarStatement() {
        try {
            return connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
