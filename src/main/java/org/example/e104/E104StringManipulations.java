package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        //write code from here
        for (int i = 0; i <5 ; i++) {
            arr[i]= input.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i].substring(0,3));
        }



    }
}


