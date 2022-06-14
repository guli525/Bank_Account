package com.peaksoft.exception;

public class BankAccount {

    private double amount;



    public void deposit(int sum) {
        amount= amount + sum;
    }

    public void withDraw(int sum) throws LimitException {

        if (amount < sum) {
            sum= (int) amount;
            amount=amount-sum;
            throw new LimitException("Не хватает денег на счете", amount);
        } else {
            amount = amount - sum;
        }

    }
    public double getAmount() {
        return amount;
    }
}


