package br.com.impacta.estacionamento.model.parking;

import java.sql.Timestamp;
import java.util.*;

public class Entrance {

    private int id;
    private Set<Integer> ticket = new TreeSet<>();


    public ParkingTicket getTicket() {
        Random random = new Random();
        int quantidade = ticket.size();  // 10
        int valor = 0;
        while (quantidade == ticket.size()){
            valor = random.nextInt(1000);
            ticket.add(valor);
        }

        ParkingTicket parkingTicket = new ParkingTicket();
        parkingTicket.setTicketNumber(valor);
        parkingTicket.setTimestamp(Timestamp.from(new Date().toInstant()));
        return parkingTicket;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
