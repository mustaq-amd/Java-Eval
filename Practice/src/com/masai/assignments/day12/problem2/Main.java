package com.masai.assignments.day12.problem2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<String,String> map=new LinkedHashMap<>();

        map.put("Telangana","Hyderabad");
        map.put("Tamilnadu","Chennai");
        map.put("Karnataka","Bangalore");
        map.put("Maharashtra","Mumbai");
        map.put("West Bengal","Kolkata");

        Set<Map.Entry<String,String>> statesAndCapital= map.entrySet();

        for (Map.Entry<String,String> entry:statesAndCapital) {
            System.out.println(entry.getKey()+"------>"+entry.getValue());
        }
    }
}
