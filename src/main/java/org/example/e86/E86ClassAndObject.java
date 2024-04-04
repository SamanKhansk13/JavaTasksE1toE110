package org.example.e86;

class Main{

    String name;
    int rollNumber;
}

public class E86ClassAndObject{
    public static void main(String[] args) {

        Main student=new Main();
        student.name="John";
        student.rollNumber=2;
        System.out.print("Name is "+student.name+" and roll number is "+student.rollNumber);
    }


}

