package org.example.e36;

import java.util.Objects;
import java.util.Scanner;

public class E36LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test

    //System.out.println("Please enter two strings");
    //System.out.println("Please enter two numbers");
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
     //   System.out.println("Please enter two strings");
        String in1= in.next();
        String in2= in.next();
    //    System.out.println("Please enter two numbers");
        int num1= in.nextInt();
        int num2= in.nextInt();

        if (in1.equals(in2) && num1==num2){
            System.out.println("AND");
        }
        else if (in1.equals(in2) || num1==num2) {
            System.out.println("OR");
        }
        else{
            System.out.println("NONE");
        }
    }
}
