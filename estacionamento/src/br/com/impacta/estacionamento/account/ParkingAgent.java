package br.com.impacta.estacionamento.account;

public class ParkingAgent extends Account {


    @Override
    public boolean resetPassword() {
        return false;
    }

    public boolean processTicket(){
        return true;
    }
}
