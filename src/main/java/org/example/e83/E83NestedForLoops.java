package org.example.e83;

public class E83NestedForLoops {
    public static void main(String[] args) {

        int[] mul = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] num = {1, 2, 3, 4, 5};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < mul.length; j++) {
                System.out.print(num[i] * mul[j] + " ");

            }
            System.out.println();
        }
    }
}

