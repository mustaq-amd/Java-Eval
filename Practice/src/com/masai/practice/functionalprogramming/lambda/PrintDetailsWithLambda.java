package com.masai.practice.functionalprogramming.lambda;

public class PrintDetailsWithLambda {

    public static void main(String[] args) {

        MyFunInterface myFunInterface= (student) -> {

            System.out.println(student.getRollno());
            System.out.println(student.getName());
            System.out.println(student.getMarks());

        };

        myFunInterface.printDetails(new Student(10,"Mustaq",100));


    }
}

@FunctionalInterface
interface MyFunInterface{

    void printDetails(Student student);

}
