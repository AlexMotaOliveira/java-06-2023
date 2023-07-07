package br.com.impacta.estacionamento.model.parking;

import br.com.impacta.estacionamento.payment.Payment;

import java.sql.Timestamp;

public class ParkingTicket {

    private int ticketNunber;
    private Timestamp timestamp;
    private Timestamp exit;
    private Double amount;
    private Payment payment;

}
