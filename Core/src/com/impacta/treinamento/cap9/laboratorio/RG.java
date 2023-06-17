package com.impacta.treinamento.cap9.laboratorio;

public class RG {

    private int numero;
    private String dataNascimento;

    public RG(){

    }
    public RG(int numero, String dataNascimento) {
        this.numero = numero;
        this.dataNascimento = dataNascimento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "RG{" +
                "numero=" + numero +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}
