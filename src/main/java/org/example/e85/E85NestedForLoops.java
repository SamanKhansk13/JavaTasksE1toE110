package org.example.e85;

public class E85NestedForLoops {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5,6,7};
int num=6;
        for (int i=0; i< array.length; i++){ //
            //System.out.print(array[i]+" ");
            for (int j=0; j<num+1; j++){ //
                System.out.print(array[j]+" ");

            }
            System.out.println();
            num--;
        }
int num2=1;
        for (int i=0; i< array.length-1; i++){
            for (int j=0; j<num2+1; j++){
                System.out.print(array[j]+" ");
            }
            System.out.println();
            num2++;
        }


    }

    
}
