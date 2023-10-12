package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

enum Brand{
    Mersedes,
    BMW,
    Audi,
    ZAZ,
    LUAZ,
    Honda,
    Toyota
}
enum Color{
    Red,
    Blue,
    Green,
    Grey,
    AutoZazSuperGray,
    LuazSuperGreen,
    Yelow

}

enum Model{
    Tavria,
    Lanos,
    Luaz,
    Carola,
    S210,
    W221,
    Slavuta,
    Zaporozec,
    Camry,
    Matis

}



public class Main {






    public static void main(String[] args) {
	CarStore store = new CarStore();
        store.GenerateCarList(200);
        store.printAllCars();
        store.printCarByBrand(Brand.LUAZ);
        store.printCarByBrandAndYearExplotation(Model.Tavria, 10);
        store.printCarOfPriceAndHighPrice(1000, 2003);
        store.printCarByModelAndBrandBesidesColor(Brand.Toyota, Model.Carola, Color.Red);
    }
}




