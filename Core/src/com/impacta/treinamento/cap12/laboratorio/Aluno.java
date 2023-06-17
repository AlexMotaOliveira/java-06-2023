package com.impacta.treinamento.cap12.laboratorio;

import com.impacta.treinamento.cap12.laboratorio.model.Pessoa;

public class Aluno extends Pessoa {

    int mensalidade;
    String curso;

    public Aluno() {
    }

    public Aluno(String nome, int idade, char sexo, int numero,
                 String dataNasc, int mensalidade, String curso) {
        super(nome, idade, sexo, new RG(numero, dataNasc));
        this.mensalidade = mensalidade;
        this.curso = curso;
    }

    @Override
    public String falar(String fala) {
        return super.getNome() + " :" + fala;
    }

    @Override
    public void mostrarDados() {

        // acesso default sexo

        System.out.println("Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                " rg: numero=" + super.getRg().getNumero() +
                ", dataNascimento='" + super.getRg().getDataNascimento() + '\'' +
                " mensalidade=" + mensalidade +
                ", curso='" + curso + '\'' +
                '}');
    }

    public int getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(int mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

//    não é possivel sobreescrever
//    public final void heracaMetodoPrivado() {
//
//    }
}
