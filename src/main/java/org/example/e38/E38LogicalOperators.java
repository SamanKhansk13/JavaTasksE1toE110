package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test
    // System.out.println("Is it weekend?");
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
     //   System.out.println("Is it weekend?");
        boolean isWeekend= in.nextBoolean();

        if (!isWeekend){
            System.out.println("Today you will be learning manual testing");
        }else{
            System.out.println("Today you will be learning Java");
        }


    }
}
