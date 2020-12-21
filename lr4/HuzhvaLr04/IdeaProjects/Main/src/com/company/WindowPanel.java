package com.company;

public class WindowPanel implements Component {
    String id;
    double angle;
    String status;

    WindowPanel() {

    }
    WindowPanel(String id, double angle, String status) {
        this.id = id;
        this.angle = angle;
        this.status = status;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public double getAngle() {
        return angle;
    }
    public void printStatus() {
        System.out.println("WindowPanel " + this.id + ", opened at angle: " + this.angle + " degrees");
    }
}
