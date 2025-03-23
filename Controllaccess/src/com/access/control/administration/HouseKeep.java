package com.access.control.administration;


public class HouseKeep {
    private String service;
    private Transport transport;

    public HouseKeep(String service) {
        this.service = service;
        this.transport = new Transport("Private Vehicle");
    }

    public void display() {
        System.out.println("      HouseKeeping: " + service);
        transport.display();
    }
}