package com.masai.assignments.day1415.problem1;

import java.io.Serializable;

public class Address implements Serializable {

    private String city;
    private String pincode;
    private String email;
    transient private String password;

    public Address() {
    }

    public Address(String city, String pincode, String email, String password) {
        this.city = city;
        this.pincode = pincode;
        this.email = email;
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
