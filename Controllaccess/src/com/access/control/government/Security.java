package com.access.control.government;


public class Security {
    private Personnel[] personnel;

    public Security() {
        this.personnel = new Personnel[]{new Personnel("Karnataka CM")};
    }

    public void display() {
        System.out.println("Security Details:");
    }
}