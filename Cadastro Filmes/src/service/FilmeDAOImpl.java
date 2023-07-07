package service;

import error.FileException;
import model.Filme;
import repository.FilmeDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FilmeDAOImpl implements FilmeDAO {

    private final static String urlBd = "jdbc:mysql://localhost:3306/impacta";
    private final static String user = "root";
    private final static String senha = "123456";
    private boolean autoCommit;  // padrão false

    public   FilmeDAOImpl(boolean autoCommit){
        this.autoCommit = autoCommit;
    }

    public FilmeDAOImpl(){

    }

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

        String query = "DELETE FROM filme where id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException s) {
            String message = "falha ao excluir o id: " + id;
            throw new FileException(message, s);
        }
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

    @Override
    public Filme sortedFilme(String genero, double nota, int numeroVotos) {

        String query = "SELECT * FROM filme where generos like ? and nota >= ? and numeroVotos >= ? ;";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, "%" + genero + "%");
            preparedStatement.setDouble(2, nota);
            preparedStatement.setInt(3, numeroVotos);

            List<Filme> filmes = getResultSet(preparedStatement);

            if (!filmes.isEmpty()) {
                Random random = new Random();
                int numeroSorteado = random.nextInt(filmes.size());
                return filmes.get(numeroSorteado);
            }
        } catch (SQLException s) {
            s.printStackTrace();
        }
        return null;
    }


    private List<Filme> getResultSet(PreparedStatement statement) throws SQLException {
        List<Filme> filmes = new ArrayList<>();
        try (ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Filme filme = new Filme();
                filme.setId(resultSet.getInt("id"));
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

    @Override
    public List<Filme> findByGeneroAndTituloAndAnoBetweenAno(String genero, String titulo, int anoInicial, int anoFinal) {
        List<Filme> filmes = new ArrayList<>();
        String query = "SELECT * FROM filme where generos like ? and titulo like ? and ano between ? and ? order by titulo;";

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, "%" + genero + "%");
            preparedStatement.setString(2, "%" + titulo + "%");
            preparedStatement.setInt(3, anoInicial);
            preparedStatement.setInt(4, anoFinal);

            return getResultSet(preparedStatement);

        } catch (SQLException s) {
            s.printStackTrace();
        }
        return filmes;
    }
    private Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(urlBd, user, senha);
        if (this.autoCommit){
            connection.setAutoCommit(false);
        }
        return connection;
    }
}
