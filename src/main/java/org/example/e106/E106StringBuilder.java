package org.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("");
        str.append("Hello");
        str.append(" ");
        str.append("World");
        String strNew= str.toString();
        System.out.println(strNew.toUpperCase());
    }
}

