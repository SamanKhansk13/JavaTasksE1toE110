package org.example.codingtask1;

public class Task7FibonacciSeries {
    public static void main(String[] args) {
     //   7.	Write a Java Program to print the first 10 numbers of Fibonacci series.
     //         series: 0 1 1 2 3 5 8 13 21 34 55 ........

        int num1=0;
        int num2=1;
        int num3=num1+num2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        for (int i=4; i<11;i++){
        num1=num2;
        num2=num3;
        num3=num1+num2;

        System.out.println(num3);}


    }
}
