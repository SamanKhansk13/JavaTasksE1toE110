package org.example.codingtask1;

public class Task10DuplicateNum {
    public static void main(String[] args) {
        //  10.	Write a program to print out duplicate elements from an Array of Strings?
        //   int[] numbers= {38, 27, 10, 38, 15, 50, 10, 27, 38, 11};
        String[] array = {"Renault", "Mercedes", "Audi", "Toyota", "Renault", "Audi", "Mitsubishi"};

        for (int i = 0; i < array.length; i++) {
          //  int count = 0;
          //  String num = array[i];
            for (int j = i+1; j < array.length; j++) {
                if (array[j].equals(array[i])) {
                    //count++;
                    System.out.println(array[i]);
                }

            }
           //  if(count>1){
             //   System.out.println(array[i]);}
        }


        }

    }

