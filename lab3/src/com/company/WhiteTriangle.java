package com.company;

import java.util.LinkedList;
import java.util.Random;

public class WhiteTriangle implements  Triangle{

    Color color;
    LinkedList<Point> triangleVerticles = new LinkedList<>();
    WhiteTriangle(){
        color = Color.White;
        Random rand = new Random();
        for(int i = 0; i < 3; i++){
            Point tempPoint = new Point(rand.nextDouble(10 + i), rand.nextDouble(15 - i));
            triangleVerticles.add(tempPoint);
        }
    }
    public Color getColor(){
        return color;
    }
}
