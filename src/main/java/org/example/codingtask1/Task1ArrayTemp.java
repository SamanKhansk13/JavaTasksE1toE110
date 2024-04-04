package org.example.codingtask1;

public class Task1ArrayTemp {
    public static void main(String[] args) {
        // 1.	Create a program that uses an array to store a list of temperatures for a week,
        //      and then uses a loop to find the highest and lowest temperature for the week.

        double[] temperature={38.7, 27.5, 10.2, 20.3, 12.7, 25.2, 40.5};  // degree celsius

        double max=temperature[0];
        double min=temperature[0];
        for (int i=0; i<temperature.length; i++){

            if(max<temperature[i]){
                max=temperature[i];
            }
            if (min>temperature[i]) {
                min=temperature[i];
            }
        }
        System.out.println("The highest temperature recorded in this week is "+max);
        System.out.println("The lowest temperature recorded in this week is "+min);


    }
}
