package com.compare.app4;



public class Window {
    private String value;

    public Window(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Window) {
            Window window = this;
            Window window1 = (Window) obj;
            if (window.value.equals(window1.value)) {
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
