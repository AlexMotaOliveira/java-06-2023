package br.com.impacta.estacionamento.account;

import br.com.impacta.estacionamento.model.parking.Entrance;
import br.com.impacta.estacionamento.model.parking.Exit;
import br.com.impacta.estacionamento.model.parking.ParkingSpot;
import br.com.impacta.estacionamento.panel.DisplayBoard;

public class Admin extends Account {




    @Override
    public boolean resetPassword() {
        return false;
    }

    public boolean addParkingSpot(ParkingSpot spot) {
        return true;
    }

    public boolean addDisplayBoard(DisplayBoard displayBoard) {
        return true;
    }

    public boolean addEntrance(Entrance entrance){
        return true;
    }

    public boolean exit(Exit exit){
        return true;
    }
}
