package com.compare.app4;



public class Table {
    private String value;

    public Table(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Table) {
            Table table = this;
            Table table1 = (Table) obj;
            if (table.value.equals(table1.value)) {
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
