package com.gos.oops.exeptions;

public class ThrowNewException {

    public static void main(String[] args) {
        try {
            arithmeticExceptionOccurence(0);
        }catch(ArithmeticException e){
            System.out.println("Caught in main");
            e.printStackTrace();
        }
    }

    private static void arithmeticExceptionOccurence(int divideBy){
        try {
            System.out.println(1000 / divideBy);
        }catch(ArithmeticException e){
            System.out.println("Caught in arthmeticExceptionOccurence method");
            throw new ArithmeticException();
        }
    }
}
