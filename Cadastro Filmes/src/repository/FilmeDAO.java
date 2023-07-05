package repository;

import model.Filme;

import java.util.List;

public interface FilmeDAO {

    Filme save(Filme filme);

    Filme update(Filme filme);

    void delete(long id);

    List<Filme> findAll();

    Filme findById(long id);

    List<Filme> findByTituloAndGeneroAndAno(String titulo, String genero, int ano);
}
