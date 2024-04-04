package org.example.e84;

public class E84NestedForLoops {
    public static void main(String[] args) {

        for (int i=0; i<1;i++){
            for (int j=0; j<4;j++){
                System.out.print("$");

            }
            System.out.println();
            for (int j=0; j<2;j++){
                System.out.println("$  $  ");
            }
            for (int j=0; j<4;j++){
                System.out.print("$");

            }
            System.out.println();

        }

    }
}
