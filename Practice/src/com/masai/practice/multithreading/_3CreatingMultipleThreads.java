package com.masai.practice.multithreading;

public class _3CreatingMultipleThreads {

    public static void main(String[] args) {
        ThreadA threadA=new ThreadA();
        ThreadB threadB=new ThreadB();
        ThreadC threadC=new ThreadC();

        threadA.start();
        threadB.start();
        threadC.start();


        for (int i =70; i <80 ; i++) {
            System.out.println("inside main method "+i);
        }

        System.out.println("end of main method");
    }
}


class ThreadA extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <11 ; i++) {
            System.out.println("inside ThreadA "+i);
        }
    }
}


class ThreadB extends Thread{
    @Override
    public void run() {
        for (int i = 11; i <21 ; i++) {
            System.out.println("inside ThreadB "+i);
        }
    }
}

class ThreadC extends Thread{
    @Override
    public void run() {
        for (int i = 21; i <31 ; i++) {
            System.out.println("inside ThreadC "+i);
        }
    }
}
