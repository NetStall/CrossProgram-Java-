package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class CarStore {
    public LinkedList<Car> Cars =new LinkedList<>();

    public void GenerateCarList(int size) {
        Random rand = new Random();
        Brand brand;
        for (int i = 0; i < size; i++) {

            Car car = new Car(i, Brand.values()[rand.nextInt(7)],
                    rand.nextInt(50) + 1970,
                    Color.values()[rand.nextInt(7)],
                    rand.nextInt(30000),
                    rand.nextInt(20000));
            Cars.add(car);
        }
    }

    public void printAllCars() {

        System.out.println(Arrays.toString(Cars.toArray()));
    }


}
