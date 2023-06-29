package com.impacta.treinamento.cap19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

    private static final String schema = "impacta";

    public Pessoa save(Pessoa pessoa) throws SQLException {
        try (Connection connection = new ConexaoFactory().conectar(schema);
             Statement statement = connection.createStatement()) {

            if (findByCpf(pessoa.getCpf()) == null) {
                String query = "INSERT INTO pessoa (NOME, CPF, TELEFONE) VALUES (" +
                        "'" + pessoa.getNome() + "'," +
                        "'" + pessoa.getCpf() + "'," +
                        "'" + pessoa.getTelefone() + "' );";
                System.out.println(query);

                int valor = statement.executeUpdate(query);
                if (valor > 0) {
//                connection.commit();
                    System.out.println("salvo com sucesso!!!!");
                    return findByCpf(pessoa.getCpf());
                } else {
                    System.out.println("não foi possivel salvar o objeto");
                    connection.rollback();
                }
            } else {
                System.out.println("Cpf já existe no banco");
            }
        } catch (SQLException s) {
            System.out.println(s);
        }
        return null;
    }

    public static Pessoa update(Pessoa pessoa) throws SQLException {

        try (Connection connection = new ConexaoFactory().conectar(schema);
             Statement statement = connection.createStatement()) {
            String query = "UPDATE pessoa SET " +
                    "`NOME` = '" + pessoa.getNome() + "', " +
                    "`CPF` = '" + pessoa.getCpf() + "', " +
                    "`TELEFONE` = '" + pessoa.getTelefone() + "' " +
                    "WHERE (`ID` = '" + pessoa.getId() + "');";

            int valor = statement.executeUpdate(query);
            if (valor > 0) {
                System.out.println("alterado com sucesso!!!!");
                return findByCpf(pessoa.getCpf());
            } else {
                System.out.println("não foi possivel alterar o objeto: " + pessoa);
            }
        } catch (SQLException s) {
            System.out.println(s);
        }
        return null;
    }

    public static void deleteById(int id) throws SQLException {
        try (Connection connection = new ConexaoFactory().conectar(schema);
             Statement statement = connection.createStatement()) {
            String query = "DELETE FROM pessoa WHERE (`ID` = " + id + ");";
            int valor = statement.executeUpdate(query);
            if (valor > 0) {
                System.out.println("excluido com sucesso!!!!");
            } else {
                System.out.println("não foi possivel excluir o obejto com o id: " + id);
            }
        } catch (SQLException s) {
            System.out.println(s);
        }
    }

    public static List<Pessoa> findAll() throws SQLException {
        List<Pessoa> pessoas = new ArrayList<>();
        try (Connection connection = new ConexaoFactory().conectar(schema);
             Statement statement = connection.createStatement()) {
            String query = "SELECT * FROM pessoa;";

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {

                int id = resultSet.getInt("ID");
                String nome = resultSet.getString("NOME");
                String cpf = resultSet.getString("CPF");
                String telefone = resultSet.getString("TELEFONE");

                Pessoa pessoaEntity = new Pessoa(id, nome, cpf, telefone);
                pessoas.add(pessoaEntity);
            }
        } catch (SQLException s) {
            System.out.println(s);
        }
        return pessoas;
    }

    public static Pessoa findById(int primaryKey) throws SQLException {
        try (Connection connection = new ConexaoFactory().conectar(schema);
             Statement statement = connection.createStatement()) {
            String query = "SELECT * FROM pessoa WHERE id = " + primaryKey;

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {

                int id = resultSet.getInt("ID");
                String nome = resultSet.getString("NOME");
                String cpf = resultSet.getString("CPF");
                String telefone = resultSet.getString("TELEFONE");

                return new Pessoa(id, nome, cpf, telefone);
            }
        } catch (SQLException s) {
            System.out.println(s);
        }
        return null;
    }

    public static Pessoa findByCpf(String cpf) throws SQLException {
        try (Connection connection = new ConexaoFactory().conectar(schema);
             Statement statement = connection.createStatement()) {
            String query = "Select * FROM pessoa WHERE (`CPF` = '" + cpf + "');";

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {

                int id = resultSet.getInt("ID");
                String nome = resultSet.getString("NOME");
                String cpf1 = resultSet.getString("CPF");
                String telefone = resultSet.getString("TELEFONE");

                return new Pessoa(id, nome, cpf1, telefone);
            }
        } catch (SQLException s) {
            System.out.println(s);
        }
        System.out.println("não foi encontrada uma pessoa com o cpf: " + cpf);
        return null;
    }

    public List<Pessoa> findByNome(String nome) throws SQLException {
        try (Connection connection = new ConexaoFactory().conectar(schema);
             Statement statement = connection.createStatement()) {
            String query = "Select * FROM pessoa WHERE `NOME` like '%" + nome + "%';";

            ResultSet resultSet = statement.executeQuery(query);

            List<Pessoa> pessoas = new ArrayList<>();
            while (resultSet.next()) {

                int id = resultSet.getInt("ID");
                String nome1 = resultSet.getString("NOME");
                String cpf1 = resultSet.getString("CPF");
                String telefone = resultSet.getString("TELEFONE");

                Pessoa pessoa = new Pessoa(id, nome1, cpf1, telefone);
                pessoas.add(pessoa);
            }
        } catch (SQLException s) {
            System.out.println(s);
        }
        System.out.println("não foi encontrada uma pessoa com o nome: " + nome);
        return null;
    }
}
