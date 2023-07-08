package br.com.impacta.estacionamento.model.parking;

import br.com.impacta.estacionamento.payment.Payment;

public class Exit {

    private int id;


    public boolean validateTicket(Payment payment) {
        switch (payment.getPaymentStatus()) {
            case Failed:
            case Unpaid:
            case Pending:
            case Refunded:
                return false;
            case Completed:
                return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
