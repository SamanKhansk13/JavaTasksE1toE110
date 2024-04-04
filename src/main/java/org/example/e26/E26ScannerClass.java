package org.example.e26;


import java.util.Scanner;

public class E26ScannerClass {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        String name = inp.nextLine().toLowerCase();
        //DO NOT CHANGE ABOVE CODE!  Write your code below
if (name.equals("chen")){
    System.out.println("teacher");
}else{
    System.out.println("student");
}
    }
}
