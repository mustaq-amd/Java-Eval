package com.masai.practice.map;

import java.util.Comparator;

public class StudentCompByMarks implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getMarks()>s2.getMarks() ? 1:-1;
    }
}
