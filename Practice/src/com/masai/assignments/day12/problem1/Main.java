package com.masai.assignments.day12.problem1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String,Student> hm=new HashMap<>();

        hm.put("Chennai",new Student(10,"Dhoni",88));
        hm.put("Hyderabad",new Student(7,"Sachin",96));
        hm.put("Bangalore",new Student(13,"Virat",85));
        hm.put("Mumbai",new Student(18,"Rohit",76));


        Set<Map.Entry<String,Student>> set= hm.entrySet();

        List<Map.Entry<String,Student>> list=new ArrayList<>(set);

        Collections.sort(list,new StudentMarksComparator());

        list.forEach(student -> System.out.println(student.getKey()+"\n"+student.getValue()));






    }
}
