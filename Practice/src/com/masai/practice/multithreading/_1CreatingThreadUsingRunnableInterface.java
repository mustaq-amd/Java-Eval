package com.masai.practice.multithreading;

public class _1CreatingThreadUsingRunnableInterface {

    public static void main(String[] args) {

        //using lambda because Runnable is a functional interface
        Thread t1=new Thread(()-> System.out.println("running run method"));
        t1.start();

        //using Runnable implemented class
        MyRunnable myRunnable=new MyRunnable();
        Thread t2=new Thread(myRunnable);
        t2.start();


    }
}

class MyRunnable implements  Runnable{

    @Override
    public void run() {
        System.out.println("running using 2nd way");

    }
}
