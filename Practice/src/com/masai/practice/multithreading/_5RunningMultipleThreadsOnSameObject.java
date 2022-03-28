package com.masai.practice.multithreading;

public class _5RunningMultipleThreadsOnSameObject {

    public static void main(String[] args) {

        Thread thread1=new Thread(new SingleObject());
        Thread thread2=new Thread(new SingleObject());

        thread1.setName("Mustaq thread..");
        thread2.setName("Virat thread..");

        thread1.start();
        thread2.start();
    }
}


class SingleObject implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <2 ; i++) {
            String tname= Thread.currentThread().getName();
            System.out.println(tname +"is running");

        }
    }
}
