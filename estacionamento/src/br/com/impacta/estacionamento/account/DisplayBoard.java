package br.com.impacta.estacionamento.account;

import br.com.impacta.estacionamento.model.parking.MotorCycle;
import br.com.impacta.estacionamento.model.parking.Compact;
import br.com.impacta.estacionamento.model.parking.Handicapped;
import br.com.impacta.estacionamento.model.parking.Large;

import java.util.List;

public class DisplayBoard {

    private int id;
    private List<Handicapped> handicappedSpot;
    private List<Large> largeSpot;
    private List<Compact> compactSpot;
    private List<MotorCycle> motorCycleSpot;

    public void showFreeSlot(){

    }
}
