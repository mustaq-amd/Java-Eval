package com.masai.practice;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.println("Enter Roll Number");
        int rollNumber= scn.nextInt();

        System.out.println("Enter Name");
        String studentName= scn.next();

        System.out.println("Enter Marks");
        int marks= scn.nextInt();

        Student student=new Student(rollNumber,studentName,marks);
        //System.out.println(student);
        int rollNum= student.getRollNumber();
        String name=student.getStudentName();
        int marks_=student.getMarks();

        System.out.println("Roll Number  : "+rollNum);
        System.out.println("Student Name : "+name);
        System.out.println("Student Marks  : "+marks_);
    }
}
