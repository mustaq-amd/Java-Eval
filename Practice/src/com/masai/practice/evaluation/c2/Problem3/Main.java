package com.masai.practice.evaluation.c2.Problem3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("Please Enter three values Eg: 10 32 2");
        String[] array=scn.nextLine().split(" ");
        int startValue = Integer.parseInt(array[0]);
        int endValue = Integer.parseInt(array[1]);
        int increment = Integer.parseInt((array[2]));

        String bag="";
        for (int i = startValue; i <= endValue; i+=increment) {

            bag+=i+" ";
        }
        System.out.println(bag);
    }
}
