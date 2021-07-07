package com.gos.oops.algorithms;

import java.util.Scanner;

public class FactorialWithoutRecursion {

    public static void main(String[] args) {

        System.out.println("Fatorial for?");
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();

        if(fact == 0){
            System.out.println("factorial is "+1);
            System.exit(0);
        }

        int val = 1;
        int total = 1;

        while(val <= fact){
            total = total*val;
            val++;
        }
        System.out.println("factorial is "+total);

    }

}
