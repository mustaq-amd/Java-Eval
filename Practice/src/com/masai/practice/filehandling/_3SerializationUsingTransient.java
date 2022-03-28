package com.masai.practice.filehandling;

import java.io.*;

public class _3SerializationUsingTransient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee employee=new Employee("Mustaq","12345");

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(employee);

        oos.flush();
        oos.close();

        System.out.println("success");

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("a.txt"));
        Employee employee1=(Employee) ois.readObject();

        ois.close();

        System.out.println(employee1);
    }
}

class Employee implements Serializable{

    String username;
    transient String password;

    public Employee(String username,String password){
        this.username=username;
        this.password=password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
