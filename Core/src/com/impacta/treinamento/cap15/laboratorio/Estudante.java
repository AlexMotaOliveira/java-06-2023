package com.impacta.treinamento.cap15.laboratorio;

public class Estudante {

    private String nome;
    private double notaMatematica;
    private double notaPortugues;
    private double media;

    public Estudante(String nome, double notaMatematica, double notaPortugues) {
        this.nome = nome;
        this.notaMatematica = notaMatematica;
        this.notaPortugues = notaPortugues;
        getMedia();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaPortugues() {
        return notaPortugues;
    }

    public void setNotaPortugues(double notaPortugues) {
        this.notaPortugues = notaPortugues;
    }

    public double getMedia() {
        media = (notaMatematica + notaPortugues) / 2;
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double recalcularNotas(double notaPortugues, double notaMatematica){
        this.notaPortugues = notaPortugues;
        this.notaMatematica = notaMatematica;
        return getMedia();
    }

    public double recalcularNotaPortugues(double notaPortugues){
        this.notaPortugues = notaPortugues;
        return getMedia();
    }

    public double recalcularNotaMatematica(double notaMatematica){
        this.notaMatematica = notaMatematica;
        return getMedia();
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaPortugues=" + notaPortugues +
                ", media=" + media +
                '}';
    }
}
