package com.compare.app4;



public class Watch {
    private String value;

    public Watch(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Watch) {
            Watch watch = this;
            Watch watch1 = (Watch) obj;
            if (watch.value.equals(watch1.value)) {
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
