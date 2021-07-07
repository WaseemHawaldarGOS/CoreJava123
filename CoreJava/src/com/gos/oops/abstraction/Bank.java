package com.gos.oops.abstraction;


public class Bank {

    private String customerName;
    private int customerAccountId;
    private String customerAddress;
    private long mobileNo;
    private String bankLiquidBalance;

    public Bank() {
    }

    public Bank(String customerName, int customerAccountId, String customerAddress, long mobileNo, String bankLiquidBalance) {
        this.customerName = customerName;
        this.customerAccountId = customerAccountId;
        this.customerAddress = customerAddress;
        this.mobileNo = mobileNo;
        this.bankLiquidBalance = bankLiquidBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAccountId() {
        return customerAccountId;
    }

    public void setCustomerAccountId(int customerAccountId) {
        this.customerAccountId = customerAccountId;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getBankLiquidBalance() {
        return bankLiquidBalance;
    }

    public void setBankLiquidBalance(String bankLiquidBalance) {
        this.bankLiquidBalance = bankLiquidBalance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "customerName='" + customerName + '\'' +
                ", customerAccountId=" + customerAccountId +
                ", customerAddress='" + customerAddress + '\'' +
                ", mobileNo=" + mobileNo +
                ", bankLiquidBalance='" + bankLiquidBalance + '\'' +
                '}';
    }
}
