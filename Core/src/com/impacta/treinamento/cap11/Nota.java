package com.impacta.treinamento.cap11;

public class Nota {

    private String nome;
    private int nota;

    public Nota(String nome, int nota) throws NotaInvalidaException {
        this.nome = nome;
        setNota(nota);
    }

    public Nota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) throws NotaInvalidaException {
        if (nota < 0 || nota > 10) {
            throw new NotaInvalidaException("nota invalida: " + nota);
        } else {
            this.nota = nota;
        }
    }


}
