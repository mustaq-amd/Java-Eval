package com.masai.evaluation.c4.problem2;

import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {

        Address address=new Address("Andhra Pradesh","Anantapur","515871");
        Employee employee=new Employee("301","Mustaq",address,"abcd@gmail.com","54321");


        //Serialization
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("emp.txt"));

        objectOutputStream.writeObject(employee);

        objectOutputStream.flush();
        objectOutputStream.close();

        System.out.println("Serialization successfully completed...");

        //Deserialization
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("emp.txt"));

        try {
            Employee employeeDetails=(Employee) objectInputStream.readObject();

            System.out.println("Getting Employee Details After Deserialization");
            System.out.println("===================================");
            System.out.println("Employee Id is : "+employeeDetails.getEmpId());
            System.out.println("Employee Name is : "+employeeDetails.getEmpName());
            System.out.println("Employee Mail id is : "+employeeDetails.getEmail());
            System.out.println("Employee Password is : "+employeeDetails.getPassword());

            Address addressOfEmployee=employeeDetails.getAddress();

            System.out.println("Address of an Employeee");
            System.out.println("=========================");
            System.out.println("State : "+addressOfEmployee.getState()+", "+" City : "+addressOfEmployee.getCity()+", "+" Pincode : "+addressOfEmployee.getPincode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}

class Address implements Serializable{

    private String state;
    private String city;
    private String pincode;

    public Address() {
    }

    public Address(String state, String city, String pincode) {
        this.state = state;
        this.city = city;
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}

class Employee implements Serializable {

    private String empId;
    private String empName;
    Address address;
    private String email;
    transient private String password;

    public Employee() {
    }

    public Employee(String empId, String empName, Address address, String email, String password) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.email = email;
        this.password = password;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
