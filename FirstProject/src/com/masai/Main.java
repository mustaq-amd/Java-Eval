package com.masai;
public class Main{

    int largestNumber(int[] arr){
        int max=0;
        for (int i = 0; i < arr.length ; i++) {
            if(max<arr[i]){
                max=arr[i];
            }

        }
        return max;
    }
    public static void main(String[] args){

        Main main=new Main();
        int[] arr={1,2,3,4,5};
        System.out.println(arr);
        int large=main.largestNumber(arr);
        System.out.println(large);
        String str="hello";
        "helo".equals("hello");
        String str1=new String("stringobj");
        //System.out.println(str1.co);

    }
}