package com.impacta.treinamento.cap12;

// filha ou filho                // pai ou mãe
// subClasse de Pessoa           // superClasse de Funcionario

/**
 * @author Alex
 */
public class Cliente extends Pessoa {

    private String enderecoEntrega;

    /**
     * @author Alex
     * Esse é o construtor da classe CLiente
     * @param nome Alex
     * @param cpf 123456789
     * @param enderecoEntrega Rua das Camelias
     */
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
