package org.example.e28;

import java.util.Scanner;

public class E28ScannerClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the length");
        double length= in.nextDouble();
        System.out.println("Please enter the width"); 
        double width= in.nextDouble();  
        // clear buffer memory exists in String input (it takes into account enter and spaces as well)
        if (length>width){
            System.out.println("The shape of your object is rectangle");
        } else if (length==width) {
            System.out.println("The shape of your object is square");
        } else{
            System.out.println("rectangle as well with inverted dimensions");
        }
    }
}
