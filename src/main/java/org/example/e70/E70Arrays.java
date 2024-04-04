package org.example.e70;

import java.util.Scanner;

public class E70Arrays {
    public static void main(String[] args) {
        int [] integers=new int[11];
// First method using loop with Scanner class to store values in array
     /*   for (int i=0; i< integers.length; i++){
            Scanner scan=new Scanner(System.in);
            int year= scan.nextInt();
            integers[i]=year;

        }
          for (int i=0;i< integers.length;i++){
            System.out.println(integers[i]);
       }*/

        // Second method to store values in array using for loop
        int j=2010;
        for (int i=0; i< integers.length;i++){
            integers[i]=j;
            j++;
            System.out.println(integers[i]);
        }





    }
}
