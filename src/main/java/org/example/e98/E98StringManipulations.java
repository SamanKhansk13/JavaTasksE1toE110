package org.example.e98;

public class E98StringManipulations {
    public static void main(String[] args) {
        String given="Hello Syntax friends";
        String str=given.substring(given.indexOf("S"),given.indexOf("x")+1);
        System.out.println("Welcome "+str+" family");

    }
}

