package com.masai.practice.multithreading;

public class _6RaceCondition {

    public static void main(String[] args) {
        Common c=new Common();

        Thread t1=new Thread(new Thread_1("Mustaq",c));
        Thread t2=new Thread(new Thread_2("Virat",c));

        t1.start();
        t2.start();
    }
}

class Common{

    public /*synchronized*/ void funA(String name){
        System.out.println("Welcome");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name);

    }
}

class Thread_1 implements Runnable{

    String name;
    Common c;

    public Thread_1(String name, Common c) {
        this.name = name;
        this.c = c;
    }

    @Override
    public void run() {
        c.funA(name);
    }
}

class Thread_2 implements Runnable{

    String name;
    Common c;

    public Thread_2(String name, Common c) {
        this.name = name;
        this.c = c;
    }

    @Override
    public void run() {
        c.funA(name);
    }

}
