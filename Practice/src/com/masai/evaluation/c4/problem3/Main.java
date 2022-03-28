package com.masai.evaluation.c4.problem3;

import java.util.*;
import java.util.stream.Stream;

class Main {

    public static void main(String[] args) {

        Map<String,Employee> map=new HashMap<>();

        map.put("HR",new Employee("101","Shreyas Iyer",240000.00));
        map.put("Sales",new Employee("106","Rishab Pant",200000.00));
        map.put("Marketing",new Employee("103","Rohit Sharma",150000.00));
        map.put("Accounts",new Employee("109","MS Dhoni",450000.00));

        Main main=new Main();

        Map<String,Employee> sortedMapWithValue= main.getSortedMapWithValue(map);

        Set<Map.Entry<String,Employee>> entries= sortedMapWithValue.entrySet();

        for(Map.Entry<String,Employee> entry:entries){
            System.out.println(entry.getKey()+"------>"+entry.getValue());
        }


    }

    public Map<String,Employee> getSortedMapWithValue(Map<String,Employee> originalMap)
    {
        //sort the supplied map according to the value(Employee salary) and return the sorted Map.
        //Note: write the sorting logic by using Lambda expression

        Set<Map.Entry<String,Employee>> set= originalMap.entrySet();
        List<Map.Entry<String,Employee>> list=new ArrayList<>(set);

        list.sort(new EmployeeCompBySalary());

        //Collections.sort(list,new EmployeeCompBySalary());

        //list.forEach(item-> System.out.println(item.getKey()+"----> "+item.getValue()));

        Map<String,Employee> sortedMap=new HashMap<>();

        list.forEach(item -> sortedMap.put(item.getKey(), item.getValue()));

        return sortedMap ;
    }
}

class Employee{

    private String empId;
    private String empName;
    private double salary;

    public Employee() {
    }

    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeCompBySalary implements Comparator<Map.Entry<String,Employee>>{


    @Override
    public int compare(Map.Entry<String, Employee> o1, Map.Entry<String, Employee> o2) {

        Employee employee1=o1.getValue();
        Employee employee2=o2.getValue();

        return employee1.getSalary() > employee2.getSalary() ? +1 : -1;
    }
}
