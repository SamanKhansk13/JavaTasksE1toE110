package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test

    //System.out.println("Are you thirsty?");
    // System.out.println("Are you sleepy?");

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
      //  System.out.println("Are you thirsty?");
        boolean isThirsty=in.nextBoolean();
      //  System.out.println("Are you sleepy?");
        boolean isSleepy=in.nextBoolean();

        if(isThirsty && isSleepy){
            System.out.println("Looks like you need to drink coffee");
        } else if (isThirsty && !isSleepy) {
            System.out.println("Looks like you need to drink water");
        }else if(!isThirsty && isSleepy) {
            System.out.println("Looks like you need to drink tea");
        }else {
            System.out.println("Looks like you need to drink nothing");
        }

    }

}
