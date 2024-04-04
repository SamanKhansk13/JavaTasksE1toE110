package org.example.e22;

import java.util.Scanner;

public class E22ScannerClass {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scan=new Scanner(System.in);
        String name= scan.nextLine();
        System.out.println("Enter your mobile number");
        String mobileNum= scan.nextLine();
        System.out.println("Enter your age");
        int age= scan.nextInt();
        System.out.println("Your name is "+name+", your age is "+age+" and your mobile number is "+mobileNum);
    }
}
