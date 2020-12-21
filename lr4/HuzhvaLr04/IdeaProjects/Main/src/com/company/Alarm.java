package com.company;

public class Alarm implements Component {
    String id;
    String idRoom;
    String pass;
    String status;

    Alarm() {

    }
    Alarm(String id, String idRoom, String pass, String status) {
         this.id = id;
         this.idRoom = idRoom;
         this.pass = pass;
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


    public String getIdRoom() {
        return idRoom;
    }

    public String getStatus() {
        return status;
    }

    public void printStatus() {
        System.out.println("Alarm in " + this.idRoom + " is " + this.status);
    }


}
