package com.compare.app4;



public class Plug {
    private String value;

    public Plug(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Plug) {
            Plug plug = this;
            Plug plug1 = (Plug) obj;
            if (plug.value.equals(plug1.value)) {
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
