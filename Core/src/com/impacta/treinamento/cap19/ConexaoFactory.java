package com.impacta.treinamento.cap19;

import java.sql.*;

public class ConexaoFactory {

    private final static String urlBd = "jdbc:mysql://localhost:3306/";
    private final static String user = "root";
    private final static String senha = "123456";

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;


    public static Connection conectar(String schema) throws SQLException {
        String url = urlBd + schema;
        connection = DriverManager.getConnection(url, user, senha);
        System.out.println("conexão realizado com sucesso!!!!!");
        return connection;
    }

    public static void fechar() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("conexão fechada com sucesso!!!!");
            }
            System.out.println("conexão inexistente ou já fechada");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void query(){
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
