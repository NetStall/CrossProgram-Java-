package com.company;

public class WhiteFactory implements AbstractFactory{

    public void createCircle()
    {
        new WhiteCircle();
    }

    public void createTriangle()
    {
        new WhiteTriangle();
    }
}
