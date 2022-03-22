package com.masai.assignments.day13.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("Mumbai");
        list.add("Delhi");
        list.add("Hyderabad");
        list.add("Chennai");
        list.add("Bangalore");

        Collections.sort(list,( s1, s2) -> s2.compareTo(s1));
        System.out.println(list);

    }
}
