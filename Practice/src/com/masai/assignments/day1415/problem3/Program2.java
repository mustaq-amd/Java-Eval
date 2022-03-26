package com.masai.assignments.day1415.problem3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {

    public static void main(String[] args) throws IOException {


        File file=new File("abc.txt");
        FileReader fileReader=new FileReader(file);

        char[] chr = new char[(int)file.length()];
        fileReader.read(chr);

        for(char c:chr){
            System.out.print(c);
        }

    }
}
