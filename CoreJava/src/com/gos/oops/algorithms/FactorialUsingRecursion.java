package com.gos.oops.algorithms;

import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        System.out.println("Fatorial for?");
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        int result = findFactorial(fact);
        System.out.println("Factorial is "+result);
    }

    public static int findFactorial(int num){
        if(num == 0){
            return 1;
        }
        return num*findFactorial(num-1);
    }
}
