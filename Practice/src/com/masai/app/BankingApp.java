package com.masai.app;

import java.util.Scanner;

public class BankingApp {


    public static void main(String[] args) {

        BankingApp bankingApp=new BankingApp();
        Scanner scn=new Scanner(System.in);
        Customer customer=null;
        while(true){
            System.out.println("Enter 1 to create account");
            System.out.println("Enter 2 to deposit");
            System.out.println("Enter 3 to check balance");
            System.out.println("Enter 4 to withdraw money");
            System.out.println("Enter 0 to exit");
            int choice=scn.nextInt();

                try{
                    if(choice==1) {
                        customer= bankingApp.createCustomer();
                        System.out.println(customer.toString()+" "+"Account number"+" : "+customer.account.getAccountNumber());
                    }
                    else if(choice==2){
                        System.out.println("Enter the amount to deposit");
                        Double depositAmount = scn.nextDouble();
                        customer.account.setBalance(depositAmount);
                        System.out.println("Amount Deposited successfully");
                    }
                    else if(choice==3){
                        double balance = customer.account.getBalance();
                        System.out.println("Balance amount is : "+balance);
                    }
                    else if(choice==4){
                        System.out.println("Enter the amount to withdraw");
                        Double withdrawAmount = scn.nextDouble();
                        customer.account.withdraw(withdrawAmount);
                        double balance = customer.account.getBalance();
                        System.out.println("Updated Balance is : "+balance);
                    }
                    else if(choice==0){
                        break;
                    }
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }




        }



    }

    public Customer createCustomer(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name= scn.nextLine();
        System.out.println("Please Enter your mobile number");
        String mobile= scn.next();
        Customer customer=new Customer();
        customer.name=name;
        customer.mobile=mobile;
        customer.account=new Account();
        customer.account.setAccountNumber("1234");

        return customer;

    }

}

class Customer{
    String name;
    String mobile;
    Account account;

    public Customer() {
    }

    public Customer(String name, String mobile, Account account) {
        this.name = name;
        this.mobile = mobile;
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}

class Account{
    private String accountNumber;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void withdraw(double amount){
        this.balance-=amount;

    }
}
