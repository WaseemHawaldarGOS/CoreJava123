package com.gos.oops.abstraction;

public class BankManager implements  BankInterface{


    @Override
    public Bank displayAccountDetails(int accountId) {

        /*
        It actually makes DB calls and sets values
         */
        Bank bank = new Bank();
        bank.setCustomerAccountId(accountId);
        bank.setCustomerAddress("Bangalore");
        bank.setCustomerName("Rahul");
        bank.setMobileNo(9988833928l);
        bank.setBankLiquidBalance("1000000$");

        return bank;
    }
}
