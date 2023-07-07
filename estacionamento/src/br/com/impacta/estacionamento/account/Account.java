package br.com.impacta.estacionamento.account;

import br.com.impacta.estacionamento.person.Person;

public abstract class Account {

    private String userName;
    private String password;
    private AccountStatus accountStatus;
    private Person person;

    public abstract boolean resetPassword();
}
