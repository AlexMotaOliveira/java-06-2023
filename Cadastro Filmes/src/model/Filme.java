package model;

import java.util.Objects;

public class Filme implements Comparable {

    private long id;
    private String titulo;
    private String diretores; // Nome1,Nome2,Nome3
    private double nota;
    private int duracao;
    private int ano;
    private String generos;
    private int numeroVotos;
    private String url;

    public Filme() {

    }

    public Filme(String titulo, String diretores, double nota, int duracao, int ano, String generos, int numeroVotos, String url) {
        this.titulo = titulo;
        this.diretores = diretores;
        this.nota = nota;
        this.duracao = duracao;
        this.ano = ano;
        this.generos = generos;
        this.numeroVotos = numeroVotos;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretores() {
        return diretores;
    }

    public void setDiretores(String diretores) {
        this.diretores = diretores;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public int getNumeroVotos() {
        return numeroVotos;
    }

    public void setNumeroVotos(int numeroVotos) {
        this.numeroVotos = numeroVotos;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", diretores='" + diretores + '\'' +
                ", nota=" + nota +
                ", duracao=" + duracao +
                ", ano=" + ano +
                ", generos='" + generos + '\'' +
                ", numeroVotos=" + numeroVotos +
                ", url='" + url + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Filme)) return false;
        Filme filme = (Filme) o;
        return getId() == filme.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public int compareTo(Object o) {
        Filme filme = (Filme) o;
        return titulo.compareTo(filme.getTitulo());
    }

    public void imprimir() {
        System.out.println(
                "\nTitulo='" + titulo +
                        "\nDiretores=" + diretores +
                        "\nnota=" + nota +
                        "\nduracao=" + duracao +
                        "\nano=" + ano +
                        "\nGeneros=" + generos +
                        "\nnumeroVotos=" + numeroVotos +
                        "\nurl=" + url +
                        "\nid=" + id);
    }
}
