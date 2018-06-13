package com.hackercode.UserDefinedException;

public class FeesBalanceException extends Exception {
    private double balance;
    public FeesBalanceException(double balance){
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

}
