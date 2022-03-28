package com.masai.practice.multithreading;

public class _4GettingAndSettingNameOfThread {

    public static void main(String[] args) {
        Thread threadA=new Thread(new Thread1());
        Thread threadB=new Thread(new Thread2());

        threadA.setName("Thread-A");
        threadB.setName("Thread-B");

        threadA.start();
        threadB.start();
    }
}


class Thread1 implements Runnable{

    @Override
    public void run() {

        for (int i = 1; i <11 ; i++) {
            String threadName= Thread.currentThread().getName();
            System.out.println(threadName +" is running");
        }

    }
}

class Thread2 implements Runnable{

    @Override
    public void run() {

        for (int i = 21; i <31 ; i++) {
            String threadName= Thread.currentThread().getName();
            System.out.println(threadName +" is running");
        }

    }
}