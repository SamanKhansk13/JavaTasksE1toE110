package org.example.e71;

public class E71Arrays {

    public static void main(String[] args) {

        int [] integers={45, 78, 12, 67, 55, 89, 23, 77, 88};
// First method
    /*
    for (int i=1; i<integers.length; i=i+3){
            System.out.print(integers[i]+" ");

        }*/
// Second method
        for (int i=0; i< integers.length; i++){
            if(integers[i]==78 || integers[i]==55 || integers[i]==77){
                System.out.print(integers[i]+" ");
            }
        }






    }
}
