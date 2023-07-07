package br.com.impacta.estacionamento.model.parking;

public abstract class ParkingSpot {

    private int id;
    private boolean isFree;

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
