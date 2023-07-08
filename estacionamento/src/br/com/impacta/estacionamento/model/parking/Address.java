package br.com.impacta.estacionamento.model.parking;

public class Address {

    private int zipCode;
    private String address;
    private String city;
    private String state;
    private String country;

    public Address(String address, String city, String state, int zipCode, String country) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }
}
