package com.impacta.treinamento.cap19;

import java.util.List;

public interface PessoaDAO {

    Pessoa save(Pessoa pessoa);

    Pessoa update(Pessoa pessoa);

    void deleteById(int id);

    List<Pessoa> findAll();

    Pessoa findById(int primaryKey);

    Pessoa findByCpf(String cpf);

    List<Pessoa> findByNome(String nome);
}
