package org.example.e100;
public class E100StringManipulations {
    public static void main(String[] args) {

        String str="racecar";
        String rev="";
        for (int i = str.length()- 1; i >= 0; i--) {
            //System.out.println(i);
            rev=rev + str.charAt(i);
        }
        System.out.println("In:"+rev);
    }
}
