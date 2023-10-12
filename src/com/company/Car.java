package com.company;

public class Car {
    private int id;
    private Brand BrandName;
    private Model model;
    private int year;
    private Color color;
    private int Price;
    private int SerialNumber;

    public Car(int id, Brand brand, int year, Color color, int price, int serialNumber, Model model) {
        this.id = id;
        this.BrandName = brand;
        this.year = year;
        this.color = color;
        this.Price = price;
        this.SerialNumber = serialNumber;
        this.model = model;
    }


    public Brand GetBrand(){
        return BrandName;
    }
    public int GetYear(){
        return year;
    }
    public int GetPrice(){
        return Price;
    }
    public Model GetModel(){
        return model;
    }
    public Color GetColor(){
        return color;
    }


    @Override
    public String toString() {
        return "\nid: " + id +
                " Brand: " + BrandName +
                " Model: "+ model +
                " Year: " + year  +
                " Color:" + color +
                " Price: " + Price +
                " Serial Number:" + SerialNumber

        ;
    }
}



