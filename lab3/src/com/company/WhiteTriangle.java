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
        printTriangle();
    }

    public void printTriangle(){
        System.out.println(color + " triangle is created" + " with verticles: ");
        printPoints();
        System.out.println("\n");
    }
    public void printPoints(){
        for(Point tempPoint: triangleVerticles){
            System.out.println(tempPoint);
        }
    }
    public Color getColor(){
        return color;
    }
}
