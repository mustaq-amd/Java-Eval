package com.masai.practice.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputTaking {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a list");
        List list=new ArrayList<>();
        while (scn.hasNextLine()) {
            String input = scn.nextLine();
            if (input == null || input.isEmpty()) {
                break;
            }
            list.add(input);
        }
        System.out.println(list);


//        Stream<Integer> array= Arrays.stream(input.trim().split(" ")).map(Integer::parseInt);
//        List list=array.collect(Collectors.toList());
//        System.out.println(list);




    }
}
