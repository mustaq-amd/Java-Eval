package com.masai.assignments.day10.datetimeapi;

public class InvalidAgeException extends Exception{

    public InvalidAgeException(){
        super("Age should not be in the future");
    }

    public InvalidAgeException(String message){
        super(message);
    }
}
