package org.example.e77;

public class E77Arrays {
    public static void main(String[] args) {
        //write code from here
    int[] in={5,4,8};
    int max=in[0];
    for (int i=0;i< in.length; i++){
        if(max<in[i]){
            max=in[i];
        }
    }
        System.out.print(max);
    }
}