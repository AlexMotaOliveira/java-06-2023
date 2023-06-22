package com.impacta.treinamento.cap15;

public class JogadorFutebol {

    private String nome;
    private String profissao;

    private Double salario;


    public JogadorFutebol(){

    }

    public JogadorFutebol(String nome, String profissao, Double salario) {
        this.nome = nome;
        this.profissao = profissao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "JogadorFutebol{" +
                "nome='" + nome + '\'' +
                "salario='" + salario +
                ", profissao='" + profissao + '\'' +
                '}';
    }

    public int compareTo(Double salario) {
        if (this.salario == salario) {
            return 0;
        } else if (this.salario < salario) {
            return 1;  // 1 em ordem decrescente || -1 em ordem crescente
        } else {
            return -1;
        }
    }


    // tipos primitivos ==
    // tipos Objeto == referencia


    @Override
    public boolean equals(Object o) {
        JogadorFutebol cast = (JogadorFutebol)o;
        return getNome().equals(cast.getNome());
    }

    @Override
    public int hashCode() {
        return getNome().hashCode();
    }
}
