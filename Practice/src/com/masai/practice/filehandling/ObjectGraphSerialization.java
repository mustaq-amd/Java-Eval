package com.masai.practice.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectGraphSerialization {

    public static void main(String[] args) throws IOException {
        Dog d = new Dog();
        // If anyone of the reachable object of above object is not implemented Serializable then Exceptions occurs
        FileOutputStream fos = new FileOutputStream("a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);
        oos.flush();
        oos.close();
        System.out.println("done");
    }
}

class Dog implements Serializable{
    Cat c=new Cat();
}
class Cat implements Serializable{
    Rat r=new Rat();
}
class Rat /*implements Serializable */{
}


