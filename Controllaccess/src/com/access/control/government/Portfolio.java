package com.access.control.government;

import com.access.control.geography.State;

public class Portfolio {
    String name;
    State[] states;
    Security security;

    public Portfolio(String cheifMinister) {
        this.name = name;
        this.states = new State[]{new State("karnataka")};
        this.security = new Security();

    }

    public void display() {
        System.out.println("Portfolio: " + name);
    }
}