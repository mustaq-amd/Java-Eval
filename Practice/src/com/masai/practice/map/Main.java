package com.masai.practice.map;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String,Student> hm=new HashMap<>();

        hm.put("Atp",new Student(301,"Mustaq",95));
        hm.put("Blr",new Student(302,"Virat",91));
        hm.put("Knl",new Student(303,"Dhoni",98));
        hm.put("Tpt",new Student(304,"Sachin",85));
        hm.put("Ukd",new Student(305,"Rohit",75));

//        Collection<Student> col= map.values();
//        List<Student> students=new ArrayList<>(col);
//
//        for(Student student:students){
//            System.out.println(student.getRollno());
//            System.out.println(student.getName());
//            System.out.println(student.getMarks());
//            System.out.println("=====================");
//        }

        Set<Map.Entry<String, Student>> entrySet= hm.entrySet();
        System.out.println(entrySet);

        for (Map.Entry<String,Student> student:entrySet) {

            System.out.println(student.getKey());

            System.out.println("-----------------");

            Student students= student.getValue();

            System.out.println(students.getRollno());
            System.out.println(students.getName());
            System.out.println(students.getMarks());

            System.out.println("*****************************");


        }


    }


}
