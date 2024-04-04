package org.example.e44;

import java.util.Scanner;

public class E44SwitchStatment {
    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String carMake= in.nextLine().toLowerCase();

        switch (carMake){
            case "bmw":
                System.out.println("Your favorite car is german car");
                break;
            case "toyota":
                System.out.println("Your favorite car is japanese car");
                break;
            case "maserati":
                System.out.println("Your favorite car is italian car");
                break;
            default:
                System.out.println("Your favorite car is unknown");
        }
    }
}
