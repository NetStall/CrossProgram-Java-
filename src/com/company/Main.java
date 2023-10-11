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



public class Main {






    public static void main(String[] args) {
	CarStore store = new CarStore();
        store.GenerateCarList(7);
        store.printAllCars();
    }
}




