package org.example.e97;

import java.util.Scanner;

public class E97StringManipulations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the browser name to proceed further with execution");
        String browser=input.nextLine().toLowerCase();

/*
 if (browser.equals("chrome") || browser.equals("CHROME") || browser.equals("ChRoMe") ){
            System.out.println("Proceed with Chrome browser");
        } else if (browser.equals("firefox") || browser.equals("FIREFOX") || browser.equals("FireFOX")) {
            System.out.println("Proceed with Firefox browser");
        }else if (browser.equals("IE") || browser.equals("ie") || browser.equals("iE")) {
            System.out.println("Proceed with IE browser");
        }else {
            System.out.println("Invalid browser");
        }
 */
        if(browser.equals("chrome")){
            System.out.println("Proceed with Chrome browser");
        } else if (browser.equals("firefox")) {
            System.out.println("Proceed with Firefox browser");
        } else if (browser.equals("ie")) {
            System.out.println("Proceed with IE browser");
        }else{
            System.out.println("Invalid browser");
        }

    }
}
