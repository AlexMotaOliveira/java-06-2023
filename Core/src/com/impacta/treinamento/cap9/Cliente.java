package com.impacta.treinamento.cap9;

// filha ou filho                // pai ou mãe
// subClasse de Pessoa           // superClasse de Funcionario
public class Cliente extends Pessoa {

    private String enderecoEntrega;

    public Cliente(String nome, String cpf, String enderecoEntrega) {
        super(nome, cpf);
        this.enderecoEntrega = enderecoEntrega;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "enderecoEntrega='" + enderecoEntrega + '\'' +
                "nome='" + super.getNome() + '\'' +
                ", cpf='" + super.getCpf() + '\'' +
                '}';
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }
}
