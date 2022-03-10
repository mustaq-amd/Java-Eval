package com.masai;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] marks={1,2,3,4,5};
        int sum=0;
        double average;
        for (int i = 0; i <marks.length ; i++) {
            sum+=marks[i];

        }
        average=sum/marks.length;
        System.out.println(sum);
        System.out.println(average);
    }




}
