package com.masai.practice.multithreading;

public class _2CreatingThreadUsingThreadClass extends Thread{
    @Override
    public void run() {

        for (int i = 1; i <25 ; i++) {
            System.out.println("inside run method "+i);

        }
        System.out.println("end of run method");
    }

    public static void main(String[] args) {

        _2CreatingThreadUsingThreadClass obj=new _2CreatingThreadUsingThreadClass();
       // obj.run(); //It will be called as normal method

        obj.start(); //here thread will start

        for (int i = 25; i <50 ; i++) {
            System.out.println("inside main method "+i);

        }
        System.out.println("end of main method");
    }
}
