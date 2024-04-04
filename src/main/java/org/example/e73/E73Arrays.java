package org.example.e73;

import java.util.Scanner;

public class E73Arrays {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] integers=new int[5];
        for (int i=0; i<integers.length; i++){
            integers[i]=in.nextInt();
        }
//        for (int n:integers){
//            System.out.println(n);
//        }
        for (int i=integers.length-1; i>=0; i--)
            System.out.println(integers[i]);

    }
}