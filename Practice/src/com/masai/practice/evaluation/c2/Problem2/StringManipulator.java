package com.masai.practice.evaluation.c2.Problem2;

import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("Please Enter a valid String");
        String str= scn.nextLine();
        StringManipulator stringManipulator=new StringManipulator();
        String result= stringManipulator.removeVowel(str);
        System.out.println(result);


    }


    public String removeVowel(String input){
        if(input != null){
            char[] ch=input.toCharArray();
            String s1="";
            for(int i=0;i< ch.length;i++){
                if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' || ch[i]=='o' ||ch[i]=='u'
                        || ch[i]=='A' || ch[i]=='E' ||ch[i]=='I' || ch[i]=='O' ||ch[i]=='U'){
                    s1+="";
                }
                else{
                    s1+=ch[i];
                }
            }
            return s1;

        }
        return null;

    }
}


