package com.impacta.treinamento.cap12.laboratorio;

import com.impacta.treinamento.cap12.laboratorio.model.Pessoa;

public class Professor extends Pessoa {

    float salario;
    String disciplina;

    public Professor() {
    }

    public Professor(String nome, int idade, char sexo, int numero,
                     String dataNasc, float salario, String disciplina) {
        super(nome, idade, sexo, new RG(numero, dataNasc));
        this.salario = salario;
        this.disciplina = disciplina;
    }


    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String falar(String fala) {
        return super.getNome() + " :" + fala;
    }


    @Override
    public void mostrarDados() {
        System.out.println("Professor{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + super.getIdade() +
                ", sexo=" + super.getSexo() +
                " rg: numero=" + super.getRg().getNumero() +
                ", dataNascimento='" + super.getRg().getDataNascimento() + '\'' +
                " salario=" + salario +
                ", disciplina='" + disciplina + '\'' +
                '}'
        );
    }
}
