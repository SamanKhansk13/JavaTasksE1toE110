package org.example.e110;

import org.example.e109.E109JavaMethods;

public class E110JavaMethods {
    void newLine() {
        System.out.println("newLine method implementation");
    }

    void displayLine() {
        System.out.println("displayLine method implementation");
    }

    public static void main(String[] args) {

        E110JavaMethods e1 = new E110JavaMethods();
        e1.newLine();
        e1.displayLine();
    }
}