package com.impacta.treinamento.cap19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAOPreparedStatementImpl implements PessoaDAO {

    private static final String schema = "impacta";

    public Pessoa save(Pessoa pessoa) {
        String query = "INSERT INTO pessoa (NOME, CPF, TELEFONE) VALUES (?,?,?);";
        try (Connection connection = new ConexaoFactory().conectar(schema);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, pessoa.getNome());
            preparedStatement.setString(2, pessoa.getCpf());
            preparedStatement.setString(3, pessoa.getTelefone());

            if (findByCpf(pessoa.getCpf()) == null) {
                System.out.println(query);

                int valor = preparedStatement.executeUpdate();
                if (valor > 0) {
//                    connection.commit();
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

    public Pessoa update(Pessoa pessoa) {
        String query = "UPDATE pessoa SET " +
                "`NOME` = ?, " +
                "`CPF` = ?, " +
                "`TELEFONE` = ? " +
                "WHERE `ID` = ?;";
        try (Connection connection = new ConexaoFactory().conectar(schema);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, pessoa.getNome());
            preparedStatement.setString(2, pessoa.getCpf());
            preparedStatement.setString(3, pessoa.getTelefone());
            preparedStatement.setInt(4, pessoa.getId());


            int valor = preparedStatement.executeUpdate();
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

    public void deleteById(int id) {
        String query = "DELETE FROM pessoa WHERE `ID` = ? ;";

        try (Connection connection = new ConexaoFactory().conectar(schema);
             PreparedStatement prepareStatement = connection.prepareStatement(query)) {

            prepareStatement.setInt(1, id);

            int valor = prepareStatement.executeUpdate();
            if (valor > 0) {
                System.out.println("excluido com sucesso!!!!");
            } else {
                System.out.println("não foi possivel excluir o obejto com o id: " + id);
            }
        } catch (SQLException s) {
            System.out.println(s);
        }
    }

    public List<Pessoa> findAll() {
        String query = "SELECT * FROM pessoa;";
        List<Pessoa> pessoas = new ArrayList<>();
        try (Connection connection = new ConexaoFactory().conectar(schema);
             PreparedStatement prepareStatement = connection.prepareStatement(query)) {

            ResultSet resultSet = prepareStatement.executeQuery();

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

    public Pessoa findById(int primaryKey) {
        String query = "SELECT * FROM pessoa WHERE id = ? ;";
        try (Connection connection = new ConexaoFactory().conectar(schema);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, primaryKey);

            ResultSet resultSet = preparedStatement.executeQuery();

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

    public Pessoa findByCpf(String cpf) {
        String query = "Select * FROM pessoa WHERE `CPF` = ? ;";
        try (Connection connection = new ConexaoFactory().conectar(schema);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, cpf);

            ResultSet resultSet = preparedStatement.executeQuery();

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

    public List<Pessoa> findByNome(String nome) {
        List<Pessoa> pessoas = new ArrayList<>();
        String query = "Select * FROM pessoa WHERE `NOME` like ? ;";
        try (Connection connection = new ConexaoFactory().conectar(schema);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, "%" + nome + "%");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt("ID");
                String nome1 = resultSet.getString("NOME");
                String cpf1 = resultSet.getString("CPF");
                String telefone = resultSet.getString("TELEFONE");

                Pessoa pessoa = new Pessoa(id, nome1, cpf1, telefone);
                pessoas.add(pessoa);
            }
            return pessoas;
        } catch (SQLException s) {
            System.out.println(s);
        }
        System.out.println("não foi encontrada uma pessoa com o nome: " + nome);
        return pessoas;
    }
}
