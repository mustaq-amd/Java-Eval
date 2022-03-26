package com.masai.assignments.day1415.problem3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Program3 {

    public static void main(String[] args) throws IOException {

        Path path= Paths.get("abc.txt");

        List<String> list=Files.readAllLines(path);

        list.forEach(System.out::println);
    }
}
