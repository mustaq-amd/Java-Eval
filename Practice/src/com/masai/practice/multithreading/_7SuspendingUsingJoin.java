package com.masai.practice.multithreading;

public class _7SuspendingUsingJoin {

    public static void main(String[] args) {

        Thread t1=new Thread(new Thread_A1());
        Thread t2=new Thread(new Thread_A2());
        Thread t3=new Thread(new Thread_A3());

        t1.start();

        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}

class Thread_A1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Selecting Students from colleges");
    }
}

class Thread_A2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Train Students");
    }
}

class Thread_A3 implements Runnable{

    @Override
    public void run() {
        System.out.println("Allocate Projects to Students");
    }
}
