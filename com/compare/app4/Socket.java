package com.compare.app4;



public class Socket {
    private String value;

    public Socket(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Socket) {
            Socket socket = this;
            Socket socket1 = (Socket) obj;
            if (socket.value.equals(socket1.value)) {
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
