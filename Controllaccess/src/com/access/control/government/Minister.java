package com.access.control.government;
import com.access.control.geography.State;
import com.access.control.administration.House;

public class Minister {
    String name;
    Portfolio[] portfolios;
    public House house;
    Security security;
    State[] states;
    public PersonnelAssistant personnalAssistent;

    public Minister(String name)
    {
        this.name=name;
        this.portfolios=new Portfolio[]{new Portfolio("cheif minister")};
        this.house=new House();
        this.personnalAssistent=new PersonnelAssistant("Siddharamaiah");
        this.security=new Security();
        this.states=new State[]{new State("Karnataka")};
    }
    public void display()
    {
        System.out.println("Minister: "+name);
        for(Portfolio p:portfolios){
            p.display();
        }
        house.display();
        personnalAssistent.display();
        security.display();
        for(State state:states)
        {
            state.display();
        }
    }
}
