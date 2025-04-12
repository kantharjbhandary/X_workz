package com.compare.app4;



public class Socks {
    private String value;

    public Socks(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Socks) {
            Socks socks = this;
            Socks socks1 = (Socks) obj;
            if (socks.value.equals(socks1.value)) {
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
