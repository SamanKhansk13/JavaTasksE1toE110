package org.example.codingtask1;

public class Task2Array {
    public static void main(String[] args) {
         //   2. Create an array of integer values.
        //       After the array is created, calculate the sum of all stored elements in that array.2.	Create an array of integer values. After the array is created, calculate the sum of all stored elements in that array.

        int[] array={11,50,30,78,62,95,33};
        int sum=0;

        for (int i=0;i< array.length;i++){
            sum+=array[i];
        }
        System.out.println("The sum of all array elements is "+sum);
    }
}
