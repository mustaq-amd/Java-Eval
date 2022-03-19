package com.masai.assignments.collection.problem1;

import java.util.Comparator;

public class EmployeeSalaryComparable implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {

        if(e1.getSalary()>e2.getSalary()){
            return 1;
        }
        else{
            return -1;
        }

    }
}
