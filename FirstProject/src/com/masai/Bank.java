package com.masai;

public class Bank {

    void getRateOfInterest(){
        System.out.println("Bank rate of interest");

    }



}
class SBI extends Bank{

    @Override
    void getRateOfInterest() {
        System.out.println("SBI rate of Interest");
    }
}
class ICICI extends  Bank{
    @Override
    void getRateOfInterest() {
        System.out.println("ICICI rate of Interest");
    }
}


class Main1{

    public static void main(String[] args) {
        ICICI icici=new ICICI();
        icici.getRateOfInterest();
    }
}
