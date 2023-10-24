package com.company;

public class BlackFactory implements  AbstractFactory {

    public void createCircle()
    {
         new BlackCircle();
    }

    public void createTriangle()
    {
         new BlackTriangle();
    }


}
