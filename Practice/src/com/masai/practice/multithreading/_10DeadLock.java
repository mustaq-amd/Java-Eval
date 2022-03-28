package com.masai.practice.multithreading;

public class _10DeadLock {

    public static void main(String[] args) {
        A a1=new A();
        B b1=new B();

        Thread t1=new Thread(new Thread_11(a1,b1));
        Thread t2=new Thread(new Thread_22(a1,b1));

        t1.start();
        t2.start();
    }
}


class A{
    public synchronized void funA(B b1){
        try {
            b1.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("funA of A starts");
        b1.funB(new A());
        System.out.println("funA of A ends");
    }
//    public synchronized void fun1(){
//        System.out.println("inside fun1 of A");
//
//    }

}

class B{
    public synchronized void funB(A a1){
        System.out.println("funB of B starts");
        a1.notify();
        a1.funA(new B());
        System.out.println("funB of B ends");
    }
//    public synchronized void fun2(){
//        System.out.println("inside fun2 of B");
//    }

}
class Thread_11 implements Runnable{

    A a1;
    B b1;

    public Thread_11(A a1, B b1) {
        this.a1 = a1;
        this.b1 = b1;
    }

    @Override
    public void run() {
        a1.funA(b1);
    }
}


class Thread_22 implements Runnable{

    A a1;
    B b1;

    public Thread_22(A a1, B b1) {
        this.a1 = a1;
        this.b1 = b1;
    }

    @Override
    public void run() {
        b1.funB(a1);
    }
}