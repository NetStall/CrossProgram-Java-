package com.company;

public class Car {
    private int id;
    private Brand BrandName;
    private int year;
    private Color color;
    private int Price;
    private int SerialNumber;

    public Car(int id, Brand brand, int year, Color color, int price, int serialNumber) {
        this.id = id;
        this.BrandName = brand;
        this.year = year;
        this.color = color;
        this.Price = price;
        this.SerialNumber = serialNumber;
    }


    public Brand GetBrand(){
        return BrandName;
    }
    @Override
    public String toString() {
        return "\nid: " + id +
                " Brand: " + BrandName +
                " Year: " + year  +
                " Color:" + color +
                " Price: " + Price +
                " Serial Number:" + SerialNumber

        ;
    }
}



