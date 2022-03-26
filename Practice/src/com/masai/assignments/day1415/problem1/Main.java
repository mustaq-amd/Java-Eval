package com.masai.assignments.day1415.problem1;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student student=new Student(301,"Mustaq",
                new Address("Anantapur","515871","abcd@gmail.com","12345"));


        //Serialization
        FileOutputStream fileOutputStream=new FileOutputStream("student.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(student);

        objectOutputStream.flush();
        objectOutputStream.close();


        //Deserialization
        FileInputStream fileInputStream=new FileInputStream("student.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);

        Student studentDetails=(Student) objectInputStream.readObject();

        System.out.println("Student Name : "+studentDetails.getName());
        System.out.println("Student Roll No : "+studentDetails.getRoll());

        Address address=studentDetails.getAddress();

        System.out.println("City : "+address.getCity());
        System.out.println("Pin code : "+address.getPincode());
        System.out.println("Email : "+address.getEmail());
        System.out.println("Password : "+address.getPassword());


    }
}
