package com.impacta.treinamento.cap12;

import java.io.FileNotFoundException;

/**
 * @see Object
 *
 */
public class TesteComposicao {

    /**
     * @description metodo main
     * @param args
     * @throws FileNotFoundException
     * @author 'Alex mota'
     * @see Object
     * @since 2023 v1.1
     *
     */
    public static void main(String[] args) throws FileNotFoundException {

        Empresa empresa = new Empresa();
        empresa.nome = "Teste";
        empresa.funcionario = new Funcionario("Alex", "123123123-12");
        empresa.funcionario.setSalario(10000D);
        empresa.funcionario.setMatricula("ST13212");


        System.out.println();

        empresa.cliente = new Cliente("João", "123123123-69", "rua um");

//        System.out.println(Empresa.pessoa.toString());

    }
}
