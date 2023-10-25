package com.company;

import java.util.Random;

public class WhiteCircle implements Circle{

    Color color;
    Point center;
    Double radius;
    WhiteCircle(){
        color = Color.White;
        Random rand = new Random();
        center = new Point(rand.nextDouble(12), rand.nextDouble(12));
        radius = rand.nextDouble(5);
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
