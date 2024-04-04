package org.example.e21;

import java.util.Scanner;

public class E21ScannerClass {
    public static void main(String[] args) {
        System.out.println("Enter your age ");
        Scanner scan=new Scanner(System.in);
        int age= scan.nextInt();
        age+=10;
        System.out.println("Your age after 10 years is "+age);


        }
    }

