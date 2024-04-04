package org.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test
    //System.out.println("Please enter your mark");
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        System.out.println("Please enter your mark");
        double marks= in.nextDouble();
        
        if (marks>=1 && marks<25){
            System.out.println("F");
        } else if (marks<45) {
            System.out.println("E");
        } else if (marks<50) {
            System.out.println("D");
        } else if (marks<60) {
            System.out.println("C");
        } else if (marks<80) {
            System.out.println("B");
        } else if (marks<100) {
            System.out.println("A");
        } else {
            System.out.println("Please enter valid marks");
        }
        
        
/*

        if(marks>80 && marks<=100){
            System.out.println("Your grade is A");
        } else if (marks>60 && marks<=80) {
            System.out.println("Your grade is B");
        } else if (marks>50 && marks<=60) {
            System.out.println("Your grade is C");
        } else if (marks>45 && marks<=50) {
            System.out.println("Your grade is D");
        } else if (marks>25 && marks<=45) {
            System.out.println("Your grade is E");
        } else if (marks>=1 && marks<=25) {
            System.out.println("Your grade is F");
        }else {
            System.out.println("Please enter valid mark");
        }*/

    }
}
