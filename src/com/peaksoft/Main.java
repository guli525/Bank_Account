package com.peaksoft;

import com.peaksoft.exception.BankAccount;
import com.peaksoft.exception.LimitException;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount();
        bankAccount.deposit(20000);
        while (true) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        System.out.println(bankAccount.getAmount());

    }
}



