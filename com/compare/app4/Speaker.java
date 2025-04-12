package com.compare.app4;



public class Speaker {
    private String value;

    public Speaker(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Speaker) {
            Speaker speaker = this;
            Speaker speaker1 = (Speaker) obj;
            if (speaker.value.equals(speaker1.value)) {
                return true;
            }
        }
        return false;
    }

    
    @Override
    public String toString() {
        return "value : " + value;
    }
}
