package com.masai.practice.functionalprogramming.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem1 {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("Mumbai","Delhi","Bangalore","Anantapur","Hyderabad","abcd");

        List list1= list.stream().filter(s->s.length()%2==0).collect(Collectors.toList());

        System.out.println(list1);
    }
}
