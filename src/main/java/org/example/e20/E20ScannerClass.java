package org.example.e20;

import java.util.Scanner;

public class E20ScannerClass {
    public static void main(String[] args) {
        System.out.println("Please Enter First Name");
        Scanner scan=new Scanner(System.in);
        String firstName= scan.nextLine();
        System.out.println("Please Enter Last Name");
        String lastName= scan.nextLine();
        System.out.print(firstName + " "+ lastName);

    }
}
