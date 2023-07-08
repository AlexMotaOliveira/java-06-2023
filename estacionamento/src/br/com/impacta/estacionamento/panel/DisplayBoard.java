package br.com.impacta.estacionamento.panel;

import br.com.impacta.estacionamento.model.parking.Compact;
import br.com.impacta.estacionamento.model.parking.Handicapped;
import br.com.impacta.estacionamento.model.parking.Large;
import br.com.impacta.estacionamento.model.parking.MotorCycle;

import java.util.ArrayList;
import java.util.List;

public class DisplayBoard {

    private int id;
    private List<Handicapped> handicappedSpot;
    private List<Large> largeSpot;
    private List<Compact> compactSpot;
    private List<MotorCycle> motorCycleSpot;

    public DisplayBoard() {

    }

    public DisplayBoard(int maxValueHandicapped, int maxValueLarge, int maxValueCompact, int maxValueMotorCycle) {
        this.handicappedSpot = new ArrayList<>(maxValueHandicapped);
        this.largeSpot = new ArrayList<>(maxValueLarge);
        this.compactSpot = new ArrayList<>(maxValueCompact);
        this.motorCycleSpot = new ArrayList<>(maxValueMotorCycle);
    }

    public void showFreeSlot() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Handicapped> getHandicappedSpot() {
        return handicappedSpot;
    }

    public void setHandicappedSpot(List<Handicapped> handicappedSpot) {
        this.handicappedSpot = handicappedSpot;
    }

    public List<Large> getLargeSpot() {
        return largeSpot;
    }

    public void setLargeSpot(List<Large> largeSpot) {
        this.largeSpot = largeSpot;
    }

    public List<Compact> getCompactSpot() {
        return compactSpot;
    }

    public void setCompactSpot(List<Compact> compactSpot) {
        this.compactSpot = compactSpot;
    }

    public List<MotorCycle> getMotorCycleSpot() {
        return motorCycleSpot;
    }

    public void setMotorCycleSpot(List<MotorCycle> motorCycleSpot) {
        this.motorCycleSpot = motorCycleSpot;
    }
}
