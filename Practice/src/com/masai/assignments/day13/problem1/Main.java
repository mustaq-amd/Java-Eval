package com.masai.assignments.day13.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Student> list=new ArrayList<>();

        list.add(new Student(23,"Chandu",950));
        list.add(new Student(13,"Maheswar",650));
        list.add(new Student(29,"Sandeep",750));
        list.add(new Student(12,"Akhil",700));
        list.add(new Student(56,"Midhun",850));

        List<Student> studentsLessThan800Marks= list.stream().filter(student -> student.getMarks()<800).collect(Collectors.toList());
        System.out.println(studentsLessThan800Marks);



    }
}
