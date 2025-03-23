package com.access.control.geography;


public class State {
    private String name;
    private District[] districts;

    public State(String name) {
        this.name = name;
        this.districts = new District[]{new District("Bengaluru")};
    }

    public void display() {
        System.out.println("      State: " + name);
        for (District district : districts) {
            district.display();
        }
    }
}