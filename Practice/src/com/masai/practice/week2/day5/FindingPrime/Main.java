package com.masai.practice.week2.day5.FindingPrime;

import java.util.Arrays;

public class Main {

    public int[] findAndReturnPrimeNumbers(int[] inputArray){

        int[] primeArray=new int[inputArray.length];

        int j=0;
        for (int i = 0; i <inputArray.length ; i++) {

            boolean isPrime = checkPrimeOrNot(inputArray[i]);

            if(isPrime){
                primeArray[j]=inputArray[i];
                j++;
            }
        }
        return primeArray;
    }

    boolean checkPrimeOrNot(int num){
        int count=0;
        for(int i=1;i<=num/2;i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count==1){
            return true;
        }

        return false;
    }

    public static void main(String[] args){
        //Create the object of Main class
        Main main=new Main();

        int[] arr = {10,12,5,50,11,14,15};
        int[] primeArray = main.findAndReturnPrimeNumbers(arr);
        int count=0;
        for (int i = 0; i < primeArray.length; i++) {
            if(primeArray[i]!=0){
                count++;
                System.out.println(primeArray[i]);
            }
        }
        if(count==0){
            System.out.println("Prime number not found in the supplied Array");
        }


    }
}
