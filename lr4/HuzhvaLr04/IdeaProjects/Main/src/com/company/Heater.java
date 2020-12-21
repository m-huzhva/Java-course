package com.company;

public class Heater implements Component {
    String id;
    double heatLevel;
    String status;

    Heater() {

    }
    Heater(String id, double heatLevel, String status) {
        this.id = id;
        this.heatLevel = heatLevel;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public void setHeatLevel(double heatLevel){
        this.heatLevel = heatLevel;
    }

    public String getId() {
        return id;
    }

    public String isStatus() {
        return status;
    }

    public double getHeatLevel() {
        return heatLevel;
    }

    public void increaseHeatLevelOne() {
        this.heatLevel += 1.0;
    }

    public void printStatus() {
        System.out.println("Heater №" + this.id + ", heat level set as: " + this.heatLevel);
    }
}
