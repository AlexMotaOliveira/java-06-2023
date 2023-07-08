package br.com.impacta.estacionamento.model.parking;

import br.com.impacta.estacionamento.payment.Payment;

import java.sql.Timestamp;

public class ParkingTicket {

    private int ticketNumber;
    private Timestamp timestamp;
    private Timestamp exit;
    private Double amount;
    private Payment payment;


    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNunber) {
        this.ticketNumber = ticketNunber;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Timestamp getExit() {
        return exit;
    }

    public void setExit(Timestamp exit) {
        this.exit = exit;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
