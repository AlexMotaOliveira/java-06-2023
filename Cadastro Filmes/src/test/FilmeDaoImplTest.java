package test;

import model.Filme;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.FilmeDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class FilmeDaoImplTest {

    private FilmeDAOImpl filmeDAO;
    private List<Filme> filmesDeleted;

    public FilmeDaoImplTest() {
        filmesDeleted = new ArrayList<>();
    }

    @BeforeEach
    void setUp() {
        filmeDAO = new FilmeDAOImpl(true);
    }

//    @AfterAll
//    void deleted() {
//        // TODO: 04/07/2023 crar o metodo de exclusão
//    }

    @Test
    void validaSeContemFilmesNaLista() {
        List<Filme> filmes = filmeDAO.findByTituloAndGeneroAndAno("jav", "terror", 2023);
        filmesDeleted.addAll(filmes);
        Assertions.assertFalse(filmes.isEmpty(), "lista esta vazia");
        filmes.forEach(Filme::imprimir);
    }

    @Test
    void validaSeAListaEstaVazia() {

    }

    @Test
    void validaSeInsereUmFilme() {
        Filme filme = new Filme("AutoCommmit", "Alex Teste", 10, 400, 2023,
                "terror", 15, "meusite.com");
        Filme filmeEntity = filmeDAO.save(filme);
        Assertions.assertNotNull(filmeEntity, "filme esta nulo");
    }


}
