package com.impacta.treinamento.cap19.laboratorio.model;

public class Funcionario {

    private int id;
    private String nome;
    private String cpf;
    private Double salario;
    private int cargoId;

    public Funcionario(int id, String name, String cpf, double salario, int cargoId) {
        this.id = id;
        this.nome = name;
        this.cpf = cpf;
        this.salario = salario;
        this.cargoId = cargoId;
    }

    public Funcionario() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getCargoId() {
        return cargoId;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCargoId(int cargoId) {
        this.cargoId = cargoId;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                ", cargoId=" + cargoId +
                '}';
    }
}
