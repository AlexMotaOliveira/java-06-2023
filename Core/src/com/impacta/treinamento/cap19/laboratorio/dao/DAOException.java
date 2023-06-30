package com.impacta.treinamento.cap19.laboratorio.dao;

public class DAOException extends Exception {

    public DAOException() {
        super();
    }

    public DAOException(String mensagem) {
        super(mensagem);
    }

    public DAOException(Throwable throwable) {
        super(throwable);
    }

    public DAOException(String mnsagem, Throwable throwable) {
        super();
    }

}
