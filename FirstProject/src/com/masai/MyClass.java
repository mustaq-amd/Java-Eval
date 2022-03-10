package com.masai;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scn.nextInt();
        System.out.println("Entered number is : "+num);
        System.out.println("result : "+num*50);

    }


}
