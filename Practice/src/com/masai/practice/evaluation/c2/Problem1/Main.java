package com.masai.practice.evaluation.c2.Problem1;

public class Main {

    public static void main(String[] args) {

        InterfaceThree interfaceThree= new ClassTwo();

        String result=interfaceThree.toString();
        System.out.println(result);

        interfaceThree.methodOne();
        interfaceThree.methodTwo();
        interfaceThree.methodThree();

        InterfaceOne interfaceOne=new ClassTwo();
        interfaceOne.methodOne();

        ClassTwo classTwo=(ClassTwo)interfaceOne;
        classTwo.methodTwo();
        classTwo.methodThree();
    }

}

interface InterfaceOne{
    void methodOne();

}
interface InterfaceTwo{
    void methodTwo();

}
interface InterfaceThree extends InterfaceOne,InterfaceTwo{
    void methodThree();

}

abstract class ClassOne implements InterfaceThree{

    @Override
    public void methodThree() {
        System.out.println("Inside methodThree of ClassOne");
    }
}

class ClassTwo extends ClassOne{

    @Override
    public void methodOne() {
        System.out.println("Inside methodOne of ClassTwo");

    }

    @Override
    public void methodTwo() {
        System.out.println("Inside methodTwo of ClassTwo");

    }

    @Override
    public String toString() {
        return "This is classTwo Object";
    }
}


