package com.masai.practice.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter date of birth Eg:dd-MM-yyyy");
        String dob=scn.nextLine();

        LocalDate birthdate=LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd-MM-yyyy"));


        int age=(int)ChronoUnit.YEARS.between(birthdate,LocalDate.now());
        System.out.println(age);

        System.out.println(age>18);
    }
}
