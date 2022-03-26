package com.masai.assignments.day1415.problem2;

public class RaceConditionSolution {

    public static void main(String[] args) {

        Employee1 employee1=new Employee1();

        Thread threadA=new Thread(new ThreadA1("Mustaq",301,employee1));
        Thread threadB=new Thread(new ThreadB1("Virat",18,employee1));

        threadA.start();
        threadB.start();

    }
}




class ThreadA1 implements Runnable{
    String name;
    int id;
    Employee1 employee1;

    public ThreadA1(String name, int id, Employee1 employee1) {
        this.name = name;
        this.id = id;
        this.employee1 = employee1;
    }

    @Override
    public void run() {
        employee1.getSalaryDetails(name,id);
    }
}

class ThreadB1 implements Runnable{

    String name;
    int id;
    Employee1 employee1;

    public ThreadB1(String name, int id, Employee1 employee1) {
        this.name = name;
        this.id = id;
        this.employee1= employee1;
    }

    @Override
    public void run() {
        employee1.getSalaryDetails(name,id);
    }
}

class Employee1 {

    public synchronized void getSalaryDetails(String empName,int empId){

        System.out.println("Welcome : "+empName);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Your Annual Salary is 3124151.00");
    }

}



