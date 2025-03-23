package com.access.control.government;



public class PersonnelAssistant {
    String name;
    public PersonnelAssistant(String name){
        this.name=name;
        System.out.println("Personal Assistant details : ");
    }
    public void display(){
        System.out.println("I am a Personal Assistant of minister : "+name);
    }
}