package com.masai.practice.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println("Local Date : "+localDate);

        LocalTime localTime=LocalTime.now();
        System.out.println("Local Time : "+localTime);

        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("Local Date Time : "+localDateTime);

        // Formatting current date
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateFormat=localDate.format(dateTimeFormatter);
        System.out.println(dateFormat);


        // Formatting any given date
        LocalDate birthDate= LocalDate.of(1996,1,14);
        dateTimeFormatter=DateTimeFormatter.ofPattern("MMM dd, yyyy");
        dateFormat=birthDate.format(dateTimeFormatter);
        System.out.println(dateFormat);

        //Period between 2 dates
        Period diff=Period.between(localDate,birthDate);
        System.out.println("My Age is : "+diff);
        System.out.println(diff.getYears());
        System.out.println(diff.getMonths());
        System.out.println(diff.getDays());

        //Duration between 2 times




    }
}
