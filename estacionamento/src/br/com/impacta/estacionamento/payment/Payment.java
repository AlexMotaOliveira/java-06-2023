package br.com.impacta.estacionamento.payment;

import java.sql.Timestamp;

public abstract class Payment {

    private Double amount;
    private PaymentStatus paymentStatus;
    private Timestamp timestamp;

    public void calculate(){

    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
