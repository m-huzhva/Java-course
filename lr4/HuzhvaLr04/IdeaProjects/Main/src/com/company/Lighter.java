package com.company;

public class Lighter implements Component {
    String id;
    int x;
    int y;
    double brightness;
    String status;

    Lighter() {

    }
    Lighter(String id, int x, int y, double brightness, String status) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.brightness = brightness;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBrightness(double brightness) {
        this.brightness = brightness;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getBrightness() {
        return brightness;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getId() {
        return id;
    }

    public String isStatus() {
        return status;
    }

    public void printStatus() {
        System.out.println("Lighter №" + this.id +" is " + this.status + ", brightness: " + this.brightness);

    }
}
