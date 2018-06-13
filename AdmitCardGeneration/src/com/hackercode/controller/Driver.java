package com.hackercode.controller;
import UserDefinedException.FeesBalanceException;
import com.hackercode.utilities.CheckingFeesBalance;

public class Driver {
    public static void main(String args[]){


        CheckingFeesBalance f =new CheckingFeesBalance(101);


        try{

            System.out.println("Deposited Rs93500");
            f.Deposited(93500);
        } catch (FeesBalanceException e) {
            System.out.println("AdmitCard not generated, Your fees is due of amount: " + e.getBalance());

        }
    }
}
