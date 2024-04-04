package org.example.codingtask1;

public class Task5SwapNumbers {
    public static void main(String[] args) {
      //  5.	Write a program to swap 2 numbers without a temporary variable?
      int x=5;
      int y=10;

        System.out.println("The x is: "+x);
        System.out.println("The y is: "+y);
        System.out.println("After swapping without temporary variable");
        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("The x is: "+x);
        System.out.println("The y is: "+y);

    }
}
