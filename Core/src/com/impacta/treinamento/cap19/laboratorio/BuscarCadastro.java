package com.impacta.treinamento.cap19.laboratorio;

import com.impacta.treinamento.cap19.laboratorio.dao.DAOException;
import com.impacta.treinamento.cap19.laboratorio.dao.FuncionarioDAO;
import com.impacta.treinamento.cap19.laboratorio.dao.FuncionarioDAO2;

import java.util.Scanner;

public class BuscarCadastro {

    public static void main(String[] args) throws DAOException {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("CPF: ");
            String cpf = scanner.nextLine();

//            FuncionarioDAO dao = new FuncionarioDAO();
            FuncionarioDAO2 dao = new FuncionarioDAO2();

            dao.findByCpf(cpf).forEach(System.out::println);
        } catch (DAOException e) {
            throw new DAOException("Falha ao buscar os dados do funcionário", e);
        } catch (NumberFormatException e) {
            throw new DAOException("Dados digitados inválidos", e);
        }
    }

}
