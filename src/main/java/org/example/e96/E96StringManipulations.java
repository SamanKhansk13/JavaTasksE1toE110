package org.example.e96;

import java.util.Scanner;

public class E96StringManipulations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any programming language");
        String programLan=input.nextLine();

        if(programLan.equals("Java")){
            System.out.println(programLan+" is a programming language");
        } else if (programLan.equals("C")){
            System.out.println(programLan+" is a procedural programming language");
        }else if (programLan.equals("C++")){
            System.out.println(programLan+" is a middle-level programming language");
        }else {
            System.out.println("Doesn't match any programming language");
        }


    }
}




