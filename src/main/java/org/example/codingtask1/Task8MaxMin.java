package org.example.codingtask1;

public class Task8MaxMin {
    public static void main(String[] args) {
      //  8.	Maximum and minimum number in the array?

        int []  numbers={38, 27, 10, 203, 127, 25, 40};  // Degree celsius

        int max=numbers[0];
        int min=numbers[0];
        for (int i=0; i<numbers.length; i++){

            if(max<numbers[i]){
                max=numbers[i];
            }
            if (min>numbers[i]) {
                min=numbers[i];
            }
        }
        System.out.println("maximum: "+max);
        System.out.println("minimum: "+min);
    }
}
