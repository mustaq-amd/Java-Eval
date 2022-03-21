package com.masai.evaluation.c3.problem3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        Set<Employee> employees=new TreeSet<>(new EmployeeSalaryComp());

        while(true){
            System.out.println("Please Enter Employee ID");
            int empId= scn.nextInt();

            System.out.println("Please Enter Employee Name");
            String name= scn.next();

            System.out.println("Please Enter City name");
            String address= scn.next();

            System.out.println("Please Enter Salary");
            double salary= scn.nextDouble();

            employees.add(new Employee(empId,name,address,salary));

            System.out.println("want more y/n");
            String choice=scn.next();

            if(choice.equalsIgnoreCase("n")){
                break;
            }


        }

        for (Employee employee:employees) {
            System.out.println(employee);

        }

    }
}
