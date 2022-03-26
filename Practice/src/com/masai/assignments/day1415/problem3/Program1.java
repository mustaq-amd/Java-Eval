package com.masai.assignments.day1415.problem3;

import java.io.*;

public class Program1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader=new BufferedReader(new FileReader("abc.txt"));

        String line= bufferedReader.readLine();

        while(line!=null){
            System.out.println(line);
            line=bufferedReader.readLine();
        }

        bufferedReader.close();




    }
}
