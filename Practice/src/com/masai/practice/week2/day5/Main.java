package com.masai.practice.week2.day5;

public class Main {

    public static void main(String[] args){

    //create an array of Animal class with size 3
    //initialize all 3 elements of this Animal class with Dog, Cat and Tiger class object.
    //call the all methods (eat,walk,makeNoise) from all the 3 objects.

        Animal[] animals=new Animal[3];
        animals[0]=new Dog();
        animals[1]=new Cat();
        animals[2]=new Tiger();

        for (Animal animal:animals) {
            animal.eat();
            animal.walk();
            animal.makeNoise();
        }



    }
}


abstract class Animal{

    public abstract void makeNoise();

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void walk() {
        System.out.println("Animal is walking");
    }

}

class Dog extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Barking...");

    }
}

class Cat extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Meaw...");


    }
}

class Tiger extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Roaring...");


    }
}