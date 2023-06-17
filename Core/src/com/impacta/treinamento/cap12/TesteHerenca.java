package com.impacta.treinamento.cap12;


public class TesteHerenca {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("João", "5465465465465-23");


        Funcionario funcionario =
                new Funcionario("Alex", "123321123-23");
        funcionario.setMatricula("ST5462465");
        System.out.println(funcionario);


        Cliente cliente = new Cliente("Maria do Bairro", "253321125-23", "Rua Camelias, nº20");
//        Cliente cliente1 = cliente;
        Cliente cliente1 = new Cliente("Maria do Bairo", "253321125-24", "Rua Camelias, nº20");
        System.out.println(cliente);

        if (cliente.equals(cliente1)) {
            System.out.println("não é possivel porque o cpf já esta cadastrado");
        } else {
            System.out.println("pode efetuar o cadastro");
        }


    }
}
