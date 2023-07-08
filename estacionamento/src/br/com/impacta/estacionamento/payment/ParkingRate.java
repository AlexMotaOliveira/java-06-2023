package br.com.impacta.estacionamento.payment;

public class ParkingRate {

    private double hours;
    private double rate;

    public double calculate(){
        return rate * hours;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
