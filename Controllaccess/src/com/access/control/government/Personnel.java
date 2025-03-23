package com.access.control.government;



public class Personnel {
    private String name;
    private Skill skill;

    public Personnel(String name) {
        this.name = name;
        this.skill = new Skill("Administration Capability");
    }

    public void display() {
        System.out.println("Personnel: " + name);
        skill.display();
    }
}