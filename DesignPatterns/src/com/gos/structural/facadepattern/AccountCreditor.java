package com.gos.structural.facadepattern;

public class AccountCreditor{

    public void creditAccount(String accNo, Double amount){
        System.out.println("Credited "+amount+" to account "+accNo);
    }
}