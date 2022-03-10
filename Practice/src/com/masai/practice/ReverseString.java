package com.masai.practice;

import java.util.Scanner;

public class ReverseString {
        public static String reversString(String input){
            //write the logic

            String str=input.trim();
            char[] ch=str.toCharArray();
            String reverseString="";

            for (int i = ch.length-1; i >=0 ; i--) {
                reverseString+=ch[i];
            }
            return reverseString;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String to reverse");
            String orignalString = sc.next();
            String result = reversString(orignalString);
            System.out.println("Original String is :" + orignalString);
            System.out.println("Reversed String is :" + result);
        }
}
