package com.hackercode.utilities;
import com.hackercode.UserDefinedException.FeesBalanceException;

public class CheckingFeesBalance {
    private double fees=94500;


    public double rollnumber;
    public CheckingFeesBalance(int rollnumber){
        this.rollnumber=rollnumber;
        System.out.println("RollNumber Is: "+rollnumber);
    }

    public void Deposited(double deposit)throws FeesBalanceException{
        double balance=fees-deposit;
        if (balance<=1000){
            System.out.println("AdmitCard generated");
            }
        else {
            throw new FeesBalanceException(balance);
            }
    }



}
