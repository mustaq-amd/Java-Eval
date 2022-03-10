package com.masai;

public class Dog {
    int age;
    void run(){
        if(age>5){
            System.out.println("Running fast");
        }
        else if(age>2 && age<5){
            System.out.println("Running slowly");
        }
        else if(age>2){
            System.out.println("Running very slowly");
        }


    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.age=10;
        dog.run();
    }
}
