package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String newStr="";
        for (int i = 0; i < word.length(); i=i+2) {
            newStr=newStr+word.charAt(i);
        }
        System.out.print(newStr);

    }
}
