package com.company;

public class Client {

    public static void createFactory(AbstractFactory factory){
        factory.createCircle();
        factory.createTriangle();

    }



    public static void main(String[] args) {
        createFactory( new BlackFactory());
        createFactory(new WhiteFactory());
    }
}
