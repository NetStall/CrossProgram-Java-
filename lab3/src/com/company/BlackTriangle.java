package com.company;

import java.util.LinkedList;
import java.util.Random;

public class BlackTriangle implements Triangle{
    Color color;
    LinkedList<Point> triangleVerticles = new LinkedList<>();
    BlackTriangle(){

        color = Color.Black;
        Random rand = new Random();
        for(int i = 0; i < 3; i++){
            Point tempPoint = new Point(rand.nextDouble(9 + i), rand.nextDouble(16 - i));
            triangleVerticles.add(tempPoint);
        }
    }
    public Color getColor(){
        return color;
    }
}
