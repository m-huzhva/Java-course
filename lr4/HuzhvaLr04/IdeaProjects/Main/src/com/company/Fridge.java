package com.company;

public class Fridge implements Component {

    String id;
    int x;
    int y;
    double power;
    String mode;
    String status;

    Fridge() {

    }
    Fridge(String id, int x, int y, double power, String mode, String status) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.power = power;
        this.mode = mode;
        this.status = status;
    }

    public int getY() {
        return y;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public int getX() {
        return x;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public String isStatus() {
        return status;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

    public void printStatus() {
        System.out.println("Fridge " + this.id + " is " + this.status + ", mode is " + this.mode + ", power is " + this.power);
    }
}
