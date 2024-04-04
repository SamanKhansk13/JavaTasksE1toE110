package org.example.codingtask1;

public class Task4Array2DSum {
    public static void main(String[] args) {
         //4.  Create a 2D array of integers.
        //     Develop a program which will calculate the sum of even and odd numbers for that array.

        int[][] inputArray={
                {2,51,8,11},
                {33,0,20,18},
                {7,26,85,32},
                {15,30,75,22}
        };
        int sumEven=0;
        int sumOdd=0;

        for (int i=0; i<inputArray.length; i++){
            for (int j=0; j<inputArray[i].length;j++){
                if(inputArray[i][j]%2==0){
                    sumEven+=inputArray[i][j];
                }
                else {
                    sumOdd+=inputArray[i][j];
                }
            }
        }
        System.out.print("The sum of even numbers is: "+sumEven);
        System.out.println();
        System.out.println("The sum of odd numbers is: "+sumOdd);
    }
}
