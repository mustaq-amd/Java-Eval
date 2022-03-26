package com.masai.assignments.day1415.problem1;

import java.io.Serializable;

public class Student implements Serializable {

    private int roll;
    private String name;
    private Address address;

    public Student() {
    }

    public Student(int roll, String name, Address address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
