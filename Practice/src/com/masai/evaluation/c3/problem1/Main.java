package com.masai.evaluation.c3.problem1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please Enter the Date of birth in the format eg:dd/MM/yyyy");
        String dob= scn.next();
        Main main=new Main();
        try {
            int age = main.getAge(dob);
            System.out.println(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }


    }

    int getAge(String dob) throws InvalidAgeException {

        boolean inputPattern=Pattern.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}",dob);
        if(!inputPattern){
            throw new InvalidAgeException("please pass the date in the proper format");
        }


        LocalDate localDate=LocalDate.now();

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateOfBirth=LocalDate.parse(dob,dateTimeFormatter);



        if(dateOfBirth.isAfter(localDate)){
            throw new InvalidAgeException("Date of birth should not be in future");
        }

        int age= (int)ChronoUnit.YEARS.between(dateOfBirth,localDate);

        return age;

    }
}
