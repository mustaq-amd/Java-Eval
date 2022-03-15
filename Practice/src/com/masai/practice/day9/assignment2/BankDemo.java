package com.masai.practice.day9.assignment2;

public class BankDemo {

    public static void main(String[] args) {
        SavingAccount savingAccount=new SavingAccount();
        savingAccount.deposit(1000);
        try {
            double balance= savingAccount.withdraw(1000);
            System.out.println("Amount Withdrawn successfully");
            System.out.println("Balance is : "+balance);
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}

class SavingAccount{
    int accounNumber;
    double balance=0;


    public void deposit(double amount){
        balance+=amount;

    }

    public double withdraw(double amount) throws InsufficientFundException {
        if(amount<balance){
            InsufficientFundException ife=new InsufficientFundException("Insufficient Amount in the Account");
            throw  ife;
        }
        balance-=amount;
        return balance;
    }
}


