package com.gos.oops.classes;

public class SymbianPhone {

    private float width;
    private float height;
    private String OS;
    private String brand;
    private float price;


    public SymbianPhone() {
    }

    public SymbianPhone(float width, float height, String OS, String brand, float price) {
        this.width = width;
        this.height = height;
        this.OS = OS;
        this.brand = brand;
        this.price = price;
    }



    @Override
    public String toString() {
        return "SymbianPhone{" +
                "width=" + width +
                ", height=" + height +
                ", OS='" + OS + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
