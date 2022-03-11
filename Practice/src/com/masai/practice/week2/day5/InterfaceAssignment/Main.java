package com.masai.practice.week2.day5.InterfaceAssignment;

import java.util.Scanner;

public class Main {

    public Hotel provideFood(int amount){

        if (amount>1000){
            return new TajHotel();
        }
        else if(amount>200 && amount<1000){
            return new RoadSideHotel();
        }
        return null;

    }


    public static void main(String[] args) {
        Main main = new Main();

        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("Please Enter the amount");
            int amount = scn.nextInt();

            Hotel hotel = main.provideFood(amount);

            if (hotel instanceof RoadSideHotel) {
                hotel.chickenBiryani();
                hotel.masalaDosa();
            } else if (hotel instanceof TajHotel) {
                TajHotel taj = (TajHotel) hotel;

                taj.welcomeDrink();
                hotel.chickenBiryani();
                hotel.masalaDosa();

            } else {
                System.out.println("Please Enter a valid amount");
            }
            if(hotel !=null){
                System.out.println("Still want more  y/n");
                String choice = scn.next();
                if(choice.equalsIgnoreCase("N")){
                    break;
                }

            }


        }
    }

}

interface Hotel{

    void chickenBiryani();
    void masalaDosa();

}

class TajHotel implements Hotel{

    @Override
    public void chickenBiryani() {
        System.out.println("Biryani from Taj Hotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("MasalaDosa from Taj Hotel");
    }

    public void welcomeDrink(){
        System.out.println("Welcome Drink from the TajHotel");
    }

}

class RoadSideHotel implements Hotel{

    @Override
    public void chickenBiryani() {
        System.out.println("Biryani from Road Side Hotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("MasalaDosa from Road Side Hotel");
    }
}

