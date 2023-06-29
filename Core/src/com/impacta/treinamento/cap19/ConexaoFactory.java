package com.impacta.treinamento.cap19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

    private final static String urlBd = "jdbc:mysql://localhost:3306/";
    private final static String user = "root";
    private final static String senha = "123456";

    public Connection conectar(String schema) {
        String url = urlBd + schema;
        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            System.out.println("conexão realizado com sucesso!!!!!");
            return con;
        } catch (SQLException s) {
            throw new RuntimeException("falha ao conectar com o banco: " + s);
        }
    }

}
