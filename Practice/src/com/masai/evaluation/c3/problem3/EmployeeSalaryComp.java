package com.masai.evaluation.c3.problem3;

import java.util.Comparator;

public class EmployeeSalaryComp implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {

        if(e1.getSalary()> e2.getSalary()){
            return 1;
        }
        else if(e1.getSalary()< e2.getSalary()){
            return -1;
        }
        else{
            return e1.getName().compareTo(e2.getName());
        }

    }
}
