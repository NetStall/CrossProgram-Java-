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
                    rand.nextInt(20000), Model.values()[rand.nextInt(10)]);
            Cars.add(car);
        }
    }




    public void printAllCars() {

        System.out.println(Arrays.toString(Cars.toArray()));
    }

    public void printCarByBrand(Brand brand){
        System.out.println("\n\n print car of Brand: "+ brand.toString());
        for(Car car : Cars){
            if(car.GetBrand() == brand){
                System.out.println(car.toString());
            }
        }

    }
    public void printCarByBrandAndYearExplotation(Model model, int years){
        System.out.println("\n\n print car of model: "+ model.toString() + " In exploitation more then " + years + " years");
        for(Car car : Cars){
            if(car.GetModel() == model && 2023 - car.GetYear()>= years){
                System.out.println(car.toString());
            }
        }

    }

    public void printCarOfPriceAndHighPrice(int Price, int year){
        System.out.println("\n\n print car of "+ year + "year"+  "And cost more then" + Price + "$");
        for(Car car : Cars){
            if(car.GetYear() == year && car.GetPrice()> Price){
                System.out.println(car.toString());
            }
        }

    }

    public void printCarByModelAndBrandBesidesColor(Brand brand, Model model, Color color){
        System.out.println("\n\n print "+ brand + " "+ model +  "Not " + color );
        for(Car car : Cars){
            if(car.GetBrand() == brand && car.GetModel() == model && car.GetColor() != color){
                System.out.println(car.toString());
            }
        }



    }




}
