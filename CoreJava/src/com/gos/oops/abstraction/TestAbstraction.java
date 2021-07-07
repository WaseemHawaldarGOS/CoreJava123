package com.gos.oops.abstraction;

public class TestAbstraction {

    public static void main(String[] args) {

        /*
        Bank Employee fetching account details
         */
        BankInterface bankEmployee = new BankEmployee();
        Bank accountDetails = bankEmployee.displayAccountDetails(10020089);
        System.out.println("Bank account details being shown to Bank Employee are \n"+accountDetails.toString());


        /*
        Bank Manager fetching account details
         */
        BankInterface bankManager = new BankManager();
        Bank accountDetailsToManager = bankManager.displayAccountDetails(10020089);
        System.out.println("\n\nBank account details being shown to Bank Manager are  \n"+accountDetailsToManager.toString());


    }
}
