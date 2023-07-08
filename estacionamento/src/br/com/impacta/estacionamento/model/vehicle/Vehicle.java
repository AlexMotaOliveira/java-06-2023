package br.com.impacta.estacionamento.model.vehicle;

import br.com.impacta.estacionamento.model.parking.ParkingTicket;

public abstract class Vehicle {

    private String licenseNo;

    public abstract void assingTicket(ParkingTicket parkingTicket);

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
}
