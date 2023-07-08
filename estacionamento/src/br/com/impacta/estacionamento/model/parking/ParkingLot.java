package br.com.impacta.estacionamento.model.parking;

import br.com.impacta.estacionamento.panel.DisplayBoard;
import br.com.impacta.estacionamento.payment.ParkingRate;

import java.util.Map;
import java.util.TreeMap;

public class ParkingLot {

    private int id;
    private String name;
    private Address address;

    private Entrance entrance;
    private Exit exit;
    private ParkingRate parkingRate;
    private Map<Integer, ParkingTicket> parkingTicketMap = new TreeMap<>();
    private DisplayBoard displayBoard;


    public boolean addEntrance(Entrance entrance) {
        return true;
    }

    public boolean addExit(Exit exit) {
        return true;
    }

    public ParkingTicket getParkingTicket(ParkingTicket parkingTicket) {
        return null;
    }

    public boolean isFull() {
        return true;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Entrance getEntrance() {
        return entrance;
    }

    public void setEntrance(Entrance entrance) {
        this.entrance = entrance;
    }

    public Exit getExit() {
        return exit;
    }

    public void setExit(Exit exit) {
        this.exit = exit;
    }

    public ParkingRate getParkingRate() {
        return parkingRate;
    }

    public void setParkingRate(ParkingRate parkingRate) {
        this.parkingRate = parkingRate;
    }

    public Map<Integer, ParkingTicket> getParkingTicketMap() {
        return parkingTicketMap;
    }

    public void setParkingTicketMap(Map<Integer, ParkingTicket> parkingTicketMap) {
        this.parkingTicketMap = parkingTicketMap;
    }

    public DisplayBoard getDisplayBoard() {
        return displayBoard;
    }

    public void setDisplayBoard(DisplayBoard displayBoard) {
        this.displayBoard = displayBoard;
    }
}
