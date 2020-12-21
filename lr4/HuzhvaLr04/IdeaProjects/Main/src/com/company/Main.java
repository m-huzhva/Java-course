package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //private ArrayList<Component> list = new ArrayList();
    public static void main(String[] args) {
	// write your code here
        Alarm alarm1 = new Alarm("1", "Hall", "qwerty", "On");
        Alarm alarm2 = new Alarm("2", "Kitchen", "qwerty", "On");

        Fridge fridge1 = new Fridge("1", 10, 10, 18.2, "medium", "On");
        Fridge fridge2 = new Fridge("2", 200, 20, 19.6, "low temperature", "On");

        Heater heater1 = new Heater("1", 40.2, "On");
        Heater heater2 = new Heater("2", 36.2, "On");
        Heater heater3 = new Heater("3", 20.2, "On");
        Heater heater4 = new Heater("4", 24.2, "On");

        Lighter lighter1 = new Lighter("1", 250, 100, 26.2, "On");
        Lighter lighter2 = new Lighter("2", 350, 100, 26.9, "On");
        Lighter lighter3 = new Lighter("3", 450, 150, 0.0, "Off");
        Lighter lighter4 = new Lighter("4", 450, 200, 25.0, "On");

        WindowPanel windowPanel1 = new WindowPanel("1", 45.0, "Norm");
        WindowPanel windowPanel2 = new WindowPanel("2", 24.2, "Norm");

        ArrayList<Component> list = new ArrayList();

        list.add(alarm1);
        list.add(alarm2);
        list.add(fridge1);
        list.add(fridge2);
        list.add(heater1);
        list.add(heater2);
        list.add(heater3);
        list.add(heater4);
        list.add(lighter1);
        list.add(lighter2);
        list.add(lighter3);
        list.add(lighter4);
        list.add(windowPanel1);
        list.add(windowPanel2);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, choose component (a - alarm, f - fridge, h - heater, l - lighter, w - windowpanel)");
        String choose = scanner.next();
        switch (choose) {
            case "a": list.add(manageAlarm(list)); break;
            default: break;
        }
        //list.add(createAlarmComponent("1","2","2","Ok"));
        printComponentsStatus(list);
    }
//alarm
    public static void printComponentsStatus(ArrayList<Component> list) {
        for(int i=0; i<list.size(); i++){
            list.get(i).printStatus();
        }
    }
    public static void changeAlarmStatusToOn  (String id, ArrayList<Component> list) {
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId() == id) {
                list.get(i).setStatus("On");
            }
        }
    }
    public static void changeAlarmStatusToOff  (String id, ArrayList<Component> list) {
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId() == id) {
                list.get(i).setStatus("Off");
            }
        }
    }
    public static Alarm createAlarmComponent(String id, String idRoom, String pass, String status) {
        return new Alarm(id, idRoom, pass, status);
    }
    public static void showAlarmList(ArrayList<Component> list) {
        System.out.println("Alarms in system: -------------");
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getClass().getName() == "com.company.Alarm") {
                list.get(i).printStatus();
            }
        }
        System.out.println("-------------------------------");
        return;
    }
    public static Alarm manageAlarm(ArrayList<Component> list) {
        Scanner scanner = new Scanner(System.in);
        String id;
        String idRoom;
        String pass;
        String status;

        Alarm newAlarm = new Alarm();
        System.out.println("Enter alarm id:");
        String currentId = scanner.next();
        System.out.println("What to do with alarms (1 - create new, 2 - show list, 3 - turn on, 4 turn off)");
        switch (scanner.next()) {
            case "1":
                System.out.println("Enter alarm data with enter: id, room, password, status");
                id = scanner.next();
                idRoom = scanner.next();
                pass = scanner.next();
                status = scanner.next();
                newAlarm = createAlarmComponent(id, idRoom, pass, status);
                break;
            case "2":
                showAlarmList(list);
                break;
            case "3":
                changeAlarmStatusToOn(currentId, list);
                break;
            case "4":
                changeAlarmStatusToOff(currentId, list);
                break;
                default: break;
        }
        return newAlarm;
    }
//end-alarm

//fridge

    public static void changeFridgeStatusToOn  (String id, ArrayList<Component> list) {
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId() == id) {
                list.get(i).setStatus("On");
            }
        }
    }
    public static void changeFridgeStatusToOff  (String id, ArrayList<Component> list) {
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId() == id) {
                list.get(i).setStatus("Off");
            }
        }
    }
    public static Fridge createFridgeComponent(String id, int x, int y, double power, String mode, String status) {
        return new Fridge(id, x, y, power, mode, status);
    }
    public static void showFridgeList(ArrayList<Component> list) {
        System.out.println("Alarms in system: -------------");
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getClass().getName() == "com.company.Fridge") {
                list.get(i).printStatus();
            }
        }
        System.out.println("-------------------------------");
        return;
    }
    public static Fridge manageFridge(ArrayList<Component> list) {
        Scanner scanner = new Scanner(System.in);
        String id;
        int x;
        int y;
        double power;
        String mode;
        String status;

        Fridge newFridge = new Fridge();
        System.out.println("Enter alarm id:");
        String currentId = scanner.next();
        System.out.println("What to do with alarms (1 - create new, 2 - show list, 3 - turn on, 4 turn off)");
        switch (scanner.next()) {
            case "1":
                System.out.println("Enter fridge data with enter: id, x, y, power, mode, status");
                id = scanner.next();
                x = scanner.nextInt();
                y = scanner.nextInt();
                power = scanner.nextDouble();
                mode = scanner.next();
                status = scanner.next();
                newFridge = createFridgeComponent(id, x, y, power, mode, status);
                break;
            case "2":
                showFridgeList(list);
                break;
            case "3":
                changeFridgeStatusToOn(currentId, list);
                break;
            case "4":
                changeFridgeStatusToOff(currentId, list);
                break;
            default: break;
        }
        return newFridge;
    }
//end-fridge
}
