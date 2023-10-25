package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Client {

    private static void createFactory(AbstractFactory factory){
        System.out.print("Creating circle: ");
        factory.createCircle();
        System.out.print("Creating triangle: ");
        factory.createTriangle();
    }


    public static void main(String[] args) throws IOException {
        char ch;

        do {
            // Display menu options
            System.out.println("1) Create white factory");
            System.out.println("2) Create black factory");
            System.out.println("0) Exit app");

            // Get user input
            System.out.print("Enter number (1,2,0): ");
            Scanner s = new Scanner(System.in);
            ch = s.nextLine().charAt(0);

            // Create factory based on user input
            switch (ch) {
                case '1':
                    createFactory(new WhiteFactory());
                    break;
                case '2':
                    createFactory(new BlackFactory());
                    break;
                case '0':
                    System.out.println("Exiting app");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (ch != '0');
    }
}


