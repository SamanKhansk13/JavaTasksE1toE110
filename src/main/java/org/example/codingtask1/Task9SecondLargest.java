package org.example.codingtask1;

public class Task9SecondLargest {
    public static void main(String[] args) {
        //   9. Write a java program to find the second largest number in the array?
        int[] numbers = {38, 27, 10, 203, 127, 25, 40};

        int max = numbers[0];
        int max2nd=numbers[0];
        int max3rd=numbers[0];
        for (int i = 0; i < numbers.length; i++) {

            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("The largest num is: " + max);
        for (int i = 0; i < numbers.length; i++) {

            if (max2nd < numbers[i] && numbers[i]!=max) {
                max2nd = numbers[i];
            }
        }
        System.out.println("The second largest num:"+max2nd);
        for (int i = 0; i < numbers.length; i++) {

            if (max3rd < numbers[i] && numbers[i]!=max && numbers[i]!=max2nd) {
                max3rd = numbers[i];
            }
        }
        System.out.println("The 3rd largest num:"+max3rd);
    }

}
