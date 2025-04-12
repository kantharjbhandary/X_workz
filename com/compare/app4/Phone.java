package com.compare.app4;



public class Phone {
    private String value;

    public Phone(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Phone) {
            Phone phone = this;
            Phone phone1 = (Phone) obj;
            if (phone.value.equals(phone1.value)) {
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
