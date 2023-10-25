package com.company;

import java.util.Random;

public class BlackCircle implements Circle{
    Color color;
    Point center;
    Double radius;
    BlackCircle(){
        color = Color.Black;
        Random rand = new Random();
        center = new Point(rand.nextDouble(10), rand.nextDouble(14));
        radius = rand.nextDouble(6);
        printCircle();
    }


    public void printCircle(){
        System.out.println(color + " circle is created" + " with center " + center + " and radius " + radius);
        System.out.println("\n");
    }

     public Color getColor(){
         return color;
     }

}
