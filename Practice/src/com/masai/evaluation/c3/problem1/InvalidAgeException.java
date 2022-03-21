package com.masai.evaluation.c3.problem1;

public class InvalidAgeException extends Exception{

    public InvalidAgeException() {
        super("Invalid Age");
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
