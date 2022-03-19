package com.masai.assignments.collection.problem1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        EmployeeSalaryComparable esc=new EmployeeSalaryComparable();

        Set<Employee> employeeSet=new TreeSet<>(esc);

        Scanner scn=new Scanner(System.in);
        while(true){

            System.out.println("Please Enter Employee ID");
            int empId= scn.nextInt();
            System.out.println("Please Enter Employee Name");
            String empName= scn.next();
            System.out.println("Please Enter Employee Salary");
            double salary= scn.nextDouble();
            employeeSet.add(new Employee(empId,empName,salary));

            System.out.println("Want more y/n");
            String choice= scn.next();

            if(choice.equalsIgnoreCase("n")){
                break;
            }

        }

        for (Employee employee:employeeSet) {
            System.out.println(employee);
        }
    }
}
