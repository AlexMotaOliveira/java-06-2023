package com.impacta.treinamento.cap19.laboratorio.dao;

import com.impacta.treinamento.cap19.laboratorio.model.Funcionario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    private final static String urlBd = "jdbc:mysql://localhost:3306/impacta";
    private final static String user = "root";
    private final static String senha = "123456";

    public void persist(Funcionario funcionario) throws DAOException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String query = "INSERT INTO tab_func " +
                "(func_name, func_rmnt_val, role_code)" +
                "VALUES (?, ?, ?)";
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, funcionario.getNome());
            preparedStatement.setDouble(2, funcionario.getSalario());
            preparedStatement.setInt(3, funcionario.getCargoId());

            preparedStatement.executeUpdate();

        } catch (SQLException s) {
            throw new DAOException("“Falha ao salvar dados do funcionário", s);
        } finally {
            closeResources(connection, preparedStatement, null);
        }
    }

    public List<Funcionario> findByName(String nome) throws DAOException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String query = "SELECT * FROM tab_func WHERE func_name LIKE ?";

        List<Funcionario> funcionarios = new ArrayList<>();
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, "%" + nome + "%");

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("func_code");
                String name = resultSet.getString("func_name");
                double salario = resultSet.getDouble("func_rmnt_val");
                int cargoId = resultSet.getInt("role_code");

                Funcionario funcionario = new Funcionario(id, name, salario, cargoId);
                funcionarios.add(funcionario);
            }
            return funcionarios;
        } catch (SQLException s) {
            throw new DAOException("Falha ao realizar consulta", s);
        } finally {
            closeResources(connection, preparedStatement, resultSet);
        }
    }


    private Connection getConnection() throws DAOException {
        try {
            return DriverManager.getConnection(urlBd, user, senha);
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    private void closeResources(Connection connection,
                                Statement statement,
                                ResultSet resultSet) {
        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException s) {

        }
    }
}
