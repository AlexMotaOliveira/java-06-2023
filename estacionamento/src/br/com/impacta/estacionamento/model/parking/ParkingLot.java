package br.com.impacta.estacionamento.model.parking;

public class ParkingLot {

    private int id;
    private String name;
    private Address address;

    public boolean addEntrance() {
        return true;
    }

    public boolean addExit() {
        return true;
    }

    public ParkingTicket getParkingTicket() {
        return null;
    }

    public boolean isFull() {
        return true;
    }

}
