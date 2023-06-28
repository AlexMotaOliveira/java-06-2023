package com.impacta.treinamento.cap19;

import java.sql.*;

public class TesteConexão {

    private final static String urlBd = "jdbc:mysql://localhost:3306/impacta?user=root&password=123456";

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void main(String[] args) {
        try {
            openDb();

            String query = "SELECT * FROM IMPACTA.teste;";

            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String nome = resultSet.getString("NOME");
                String cpf = resultSet.getString("CPF");
                String telefone = resultSet.getString("TELEFONE");
                System.out.println(nome + " " + cpf + " " + telefone);
            }
            System.out.println("fim da bus no banco");
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void openDb() throws SQLException {
        connection = DriverManager.getConnection(urlBd);
        statement = connection.createStatement();
        System.out.println("conexão realizada com sucesso .....");
    }
}
