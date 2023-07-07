package br.com.impacta.estacionamento.payment;

import java.sql.Timestamp;

public abstract class Payment {

    private Double amount;
    private PaymentStatus paymentStatus;
    private Timestamp timestamp;

    public void calculate(){

    }
}
