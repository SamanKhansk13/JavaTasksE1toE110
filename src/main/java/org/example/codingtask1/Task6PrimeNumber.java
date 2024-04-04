package org.example.codingtask1;

import java.util.Scanner;

public class Task6PrimeNumber {
        public static void main(String[] args) {
            int i;
            boolean isPrime=true;

            System.out.println("Please enter n: ");
            Scanner UserInput = new Scanner(System.in);
            int n = UserInput.nextInt();

            for(i=2; i<=n-1; i++) {
                if (n % i == 0) {
                    isPrime=false;
                    break;
                }
            }

            if (isPrime){
                if (n==1){
                    System.out.println("This is neither prime nor composite number");
                }else {
                    System.out.println("This is a prime number");
                }
            }else{
                System.out.println("This is not a prime number");
            }

        }
    }

