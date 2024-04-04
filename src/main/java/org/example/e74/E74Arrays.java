package org.example.e74;

import java.util.Scanner;

public class E74Arrays {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int[] integers=new int[5];
        for (int i=0; i<integers.length; i++){
            integers[i]=in.nextInt();
        }
        for (int n:integers){
            System.out.println(n*10);

        }
    }
}
