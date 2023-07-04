package service;

import error.FileException;
import model.Filme;
import repository.FilmeDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FilmeDAOImpl implements FilmeDAO {

    private final static String urlBd = "jdbc:mysql://localhost:3306/impacta";
    private final static String user = "root";
    private final static String senha = "123456";


    @Override
    public Filme save(Filme filme) {
        String query = "INSERT INTO filme VALUES (NULL,?, ?, ?, ?, ?, ?, ?, ?);";

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, filme.getTitulo());
            preparedStatement.setString(2, filme.getDiretores());
            preparedStatement.setDouble(3, filme.getNota());
            preparedStatement.setInt(4, filme.getDuracao());
            preparedStatement.setInt(5, filme.getAno());
            preparedStatement.setString(6, filme.getGeneros());
            preparedStatement.setInt(7, filme.getNumeroVotos());
            preparedStatement.setString(8, filme.getUrl());

            preparedStatement.executeUpdate();
            System.out.println("filme salvo com sucesso!!!");

        } catch (SQLException s) {
            throw new FileException("Não foi possivel salver no banco: ", s);
        }
        return filme;
    }

    @Override
    public Filme update(Filme filme) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Filme> findAll() {
        return null;
    }

    @Override
    public Filme findById(long id) {
        return null;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(urlBd, user, senha);
    }
}
