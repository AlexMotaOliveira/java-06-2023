package br.com.impacta.estacionamento.account;

public class Admin extends Account {


    @Override
    public boolean resetPassword() {
        return false;
    }

    public boolean addParkingSpot(int floorName, int spot) {
        return true;
    }

    public boolean addDisplayBoard(int floorName, int displayBoard) {
        return true;
    }

    public boolean addEntrance(String entrance){
        return true;
    }

    public boolean exit(String exit){
        return true;
    }
}
