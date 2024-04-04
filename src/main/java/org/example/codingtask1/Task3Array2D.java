package org.example.codingtask1;

public class Task3Array2D {
    public static void main(String[] args) {
         //  3.	Create a 2D array or integer type where you will store odd and even numbers.
        //      Develop a program which will identify/print the even numbers only

        int[][] inputArray={
                {2,5,8,11},
                {33,5,20,8},
                {7,26,85,32},
                {15,30,75,22}
        };

        for (int i=0; i<inputArray.length; i++){
            for (int j=0; j<inputArray[i].length;j++){
                if(inputArray[i][j]%2==0){
                    System.out.println("At index "+i + j+" we have even number "+inputArray[i][j]+" ");
                }
            }
        }


    }
}
