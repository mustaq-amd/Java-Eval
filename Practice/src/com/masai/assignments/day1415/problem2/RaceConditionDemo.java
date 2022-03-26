package com.masai.assignments.day1415.problem2;

public class RaceConditionDemo {

    public static void main(String[] args) {

        Employee employee=new Employee();

        Thread threadA=new Thread(new ThreadA("Mustaq",301,employee));
        Thread threadB=new Thread(new ThreadB("Virat",18,employee));

        threadA.start();
        threadB.start();

    }
}




class ThreadA implements Runnable{
    String name;
    int id;
    Employee employee;

    public ThreadA(String name, int id, Employee employee) {
        this.name = name;
        this.id = id;
        this.employee = employee;
    }

    @Override
    public void run() {
        employee.getSalaryDetails(name,id);
    }
}

class ThreadB implements Runnable{

    String name;
    int id;
    Employee employee;

    public ThreadB(String name, int id, Employee employee) {
        this.name = name;
        this.id = id;
        this.employee = employee;
    }

    @Override
    public void run() {
        employee.getSalaryDetails(name,id);
    }
}

class Employee {

    public void getSalaryDetails(String empName,int empId){

        System.out.println("Welcome : "+empName);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Your Annual Salary is 3124151.00");
    }

}



