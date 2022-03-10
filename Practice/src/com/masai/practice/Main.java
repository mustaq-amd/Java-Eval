package com.masai.practice;

abstract class Bird {
    public abstract void fly();
}

class Parrot extends Bird{
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
    public void sing(){
        System.out.println("I am Singing");
    }

}

public class Main{
    public static void main(String[] args){
        Bird b1 = new Parrot();
        //with this b1 reference call the fly method
        //and after downcasting this b1 reference to the Parrot class object, call the sing method also
        b1.fly();
        Parrot p=(Parrot) b1;
        p.sing();

    }
}

