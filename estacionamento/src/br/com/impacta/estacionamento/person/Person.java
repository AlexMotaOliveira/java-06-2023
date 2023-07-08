package br.com.impacta.estacionamento.person;

import br.com.impacta.estacionamento.model.parking.Address;

public class Person {

    private String name;
    private Address address;


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Person(String name, String streetAddress, String city, String state, int zipCode, String country) {
        this.name = name;
        this.address = new Address(streetAddress, city, state, zipCode, country);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
