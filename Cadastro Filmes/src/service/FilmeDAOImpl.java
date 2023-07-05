package service;

import error.FileException;
import model.Filme;
import repository.FilmeDAO;

import java.sql.*;
import java.util.ArrayList;
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
        List<Filme> filmes = new ArrayList<>();
        String query = "SELECT * FROM filme order by titulo desc";

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            filmes = getResultSet(statement);
        } catch (SQLException s) {
            s.printStackTrace();
        }
        return filmes;
    }


    @Override
    public Filme findById(long id) {
        return null;
    }

    @Override
    public List<Filme> findByTituloAndGeneroAndAno(String titulo, String genero, int ano) {
        List<Filme> filmes = new ArrayList<>();

        String query = "SELECT * FROM filme where titulo like ? and generos like ? and ano >= ? order by titulo desc;";

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, "%" + titulo + "%");
            preparedStatement.setString(2, "%" + genero + "%");
            preparedStatement.setInt(3, ano);

            filmes = getResultSet(preparedStatement);

        } catch (SQLException s) {
            s.printStackTrace();
        }
        return filmes;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(urlBd, user, senha);
    }

    private List<Filme> getResultSet(PreparedStatement statement) throws SQLException {
        List<Filme> filmes = new ArrayList<>();
        try (ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Filme filme = new Filme();
                filme.setTitulo(resultSet.getString("titulo"));
                filme.setDiretores(resultSet.getString("diretores"));
                filme.setNota(resultSet.getDouble("nota"));
                filme.setAno(resultSet.getInt("ano"));
                filme.setGeneros(resultSet.getString("generos"));
                filme.setNumeroVotos(resultSet.getInt("numeroVotos"));
                filme.setDuracao(resultSet.getInt("duracao"));
                filme.setUrl(resultSet.getString("url"));

                filmes.add(filme);
            }
        }
        return filmes;
    }
}
