package com.gos.structural.facadepattern;

/*
https://www.javabrahman.com/design-patterns/facade-design-pattern-in-java/
 */
public class AccountCreditor{

    public void creditAccount(String accNo, Double amount){
        System.out.println("Credited "+amount+" to account "+accNo);
    }
}