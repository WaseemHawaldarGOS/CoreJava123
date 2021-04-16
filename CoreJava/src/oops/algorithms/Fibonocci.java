package oops.algorithms;//0 1 1 2 3 5 8 13 21 34 55..

import java.util.Scanner;

public class Fibonocci {

    public static void main(String[] args) {

        System.out.println("How many fibonocci numbers?");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int f1 = 0;
        System.out.print(f1+" ");
        int f2 = 1;
        System.out.print(f2+" ");
        int sum = 0;
        sum = f1+f2;
        System.out.print(sum+" ");

        while(count >= 2){
            f1 = f2;
            f2 = sum;
            sum = f1 + f2;
            System.out.print(sum+" ");
            count--;
        }



    }


}
