package org.example.e76;

public class E76Arrays {
    public static void main(String[] args) {
        //please write code from here
        double[][] a = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };
        //write code from here
        for (int i=0;i<3;i++){
            for (int j=0; j<4; j++){
                System.out.print(2*a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
