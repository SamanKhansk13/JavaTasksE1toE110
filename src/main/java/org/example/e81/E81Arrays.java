package org.example.e81;

public class E81Arrays {
    public static void main(String[] args) {
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
     //write the code from here
        int sum=0;
        for (int i=0;i<a.length; i=i+2){

            for (int j=0; j<a[i].length; j=j+2){
                sum=sum+a[i][j];
            }

        }
        System.out.println(sum);

    }
    }
