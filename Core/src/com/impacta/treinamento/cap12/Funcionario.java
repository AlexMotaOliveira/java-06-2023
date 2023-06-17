package com.impacta.treinamento.cap12;

// filha ou filho                // pai ou mãe
// subClasse de Pessoa           // superClasse de Funcionario
// java não permite herança multipla
public class Funcionario extends Pessoa {

    private String matricula;
    private double salario;

    public Funcionario(String nome,
                       String cpf) {
        super(nome, cpf);
    }

    public Funcionario(String nome, String cpf, String matricula) {
        super(nome, cpf);
    }

    public Funcionario(String nome, String cpf, String matricula, double salario) {
        super(nome, cpf);
    }

    // this é um instancia da classe
    // sobreEscrever com novos comportamentos

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula='" + matricula + '\'' +
                ", salario=" + salario +
                "nome='" + super.getNome() + '\'' +
                ", cpf='" + super.getCpf() + '\'' +
                '}';
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

//    @Override  não é possivle sobreescrever um metodo como final da classe superior
//    public void setNome(String nome, String sobrenome) {
//        super.setNome(nome);
//    }
}
