package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        char gender=in.nextLine().toUpperCase().charAt(0);
        System.out.println("Please enter your age");
        int age= in.nextInt();

if(age>25){
    if(gender=='F'){
        System.out.println("Woman");
    }else{
        System.out.println("Man");
    }
}else{
    if(gender=='F'){
        System.out.println("Girl");
    }else{
        System.out.println("Boy");
    }

}




          }
}
