package com.compare.app2;



public class Camera {
    private String size;
    private String brand;
    private int quantity;

    public Camera(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Camera) {
            Camera camera = this;
            Camera camera1 = (Camera)obj;
            if (camera.brand.equals(camera1.brand) &&
                camera.size.equals(camera1.size) &&
                camera.quantity == camera1.quantity) {
                return true;
            }
        }
        return false;
    }

    
    @Override
    public String toString() {
        return "size : " + size + ", brand : " + brand + ", quantity : " + quantity;
    }
}
