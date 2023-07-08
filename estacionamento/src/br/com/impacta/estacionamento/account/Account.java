package br.com.impacta.estacionamento.account;

import br.com.impacta.estacionamento.person.Person;

public abstract class Account {

    private String userName;
    private String password;
    private AccountStatus accountStatus;
    private Person person;

    public abstract boolean resetPassword();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
