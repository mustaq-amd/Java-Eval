package com.masai.practice.collection.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> stringList=new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

//        List sortedList=stringList.stream().sorted().collect(Collectors.toList());
        //stringList.clear();//clear all the elements
        System.out.println(stringList);
//        stringList.forEach(e -> {
//            System.out.println(e+1);
//        });
        Stream<Integer> integerStream = stringList.stream().map(Integer::parseInt);
        System.out.println(stringList);
        System.out.println(integerStream);
        integerStream.forEach(e -> {
            System.out.println(e+1);
        });

        List list=new ArrayList();
        list.add("Mustaq");
        list.add("Virat");
        list.add("Dhoni");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,"Mohammed");
        list.addAll(2,stringList);

        list.set(7,"one");

        System.out.println(list);
        System.out.println(list.size());

        //System.out.println(list.contains("Mustaq"));

//        for (Object elements:list) {
//            System.out.println(elements);
//        }
//        System.out.println(list.get(0));
//        System.out.println(list.indexOf("Mohammed"));
//        System.out.println(list.isEmpty());







    }
}
