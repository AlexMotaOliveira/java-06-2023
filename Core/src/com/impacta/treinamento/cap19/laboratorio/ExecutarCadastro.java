package com.impacta.treinamento.cap19.laboratorio;

import com.impacta.treinamento.cap19.laboratorio.dao.DAOException;
import com.impacta.treinamento.cap19.laboratorio.dao.FuncionarioDAO;
import com.impacta.treinamento.cap19.laboratorio.dao.FuncionarioDAO2;
import com.impacta.treinamento.cap19.laboratorio.model.Funcionario;

import java.util.Scanner;

public class ExecutarCadastro {

    public static void main(String[] args) throws DAOException {
        Funcionario funcionarioEntity = new Funcionario();
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Nome          :");
            String nome = scanner.nextLine();

            System.out.println("CPF       :");
            String cpf = scanner.nextLine();

            System.out.println("Salario       :");
            Double salario = scanner.nextDouble();

            System.out.println("Cod. Cargo    :");
            int cargoId = scanner.nextInt();

            Funcionario funcionario = new Funcionario();
            funcionario.setNome(nome);
            funcionario.setCpf(cpf);
            funcionario.setSalario(salario);
            funcionario.setCargoId(cargoId);

//            FuncionarioDAO dao = new FuncionarioDAO();
            FuncionarioDAO2 dao = new FuncionarioDAO2();

            dao.persist(funcionario);
            funcionarioEntity = dao.findByCpf(funcionario.getCpf()).get(0);
        } catch (DAOException e) {
            throw new DAOException("Falha ao salvar dados do funcionário", e);
        } catch (NumberFormatException e) {
            throw new DAOException("Dados digitados inválidos", e);
        }
        System.out.println("Funcionario cadastrado com sucesso!!!");
        System.out.println(funcionarioEntity);
    }
}
