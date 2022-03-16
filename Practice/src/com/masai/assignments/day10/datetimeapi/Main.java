package com.masai.assignments.day10.datetimeapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter joining date Eg:dd-MM-yyyy");
        String input = scn.next();


        EmployeeBonus employeeBonus=new EmployeeBonus();
        try {
            double bonus = employeeBonus.giveBonus(input);
            System.out.println("Bonus is : "+bonus);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}

class EmployeeBonus{

    public double giveBonus(String joiningDate) throws InvalidAgeException {

        boolean inputPattern= Pattern.matches("[0-9]{2}-[0-9]{2}-[0-9]{4}",joiningDate);

        if(!inputPattern){
            throw new InvalidAgeException("Please pass the date in correct format");
        }

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dateOfJoin = LocalDate.parse(joiningDate,dateTimeFormatter);

        LocalDate localDate = LocalDate.now();

        if(dateOfJoin.isAfter(localDate)){
            throw new InvalidAgeException();

        }

        int yearsOfExperience = (int)ChronoUnit.YEARS.between(dateOfJoin,localDate);

        if(yearsOfExperience<1){
            return 5000;
        }
        else if(yearsOfExperience>=1 && yearsOfExperience<2){
            return 8000;
        }

        return 10000;

    }
}