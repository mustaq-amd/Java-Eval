package com.masai.practice.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FileHandlingNIOPackage {
    public static void main(String[] args) throws IOException {

        //getting the path object

            //Path path= Paths.get("myFileFolder1"); //for folder
            //Path path1= Paths.get("myFileFolder1//a1.txt"); //for files

        //create a folder
            //Files.createDirectory(path);

        //creaate a file
            //Files.createFile(path1);

        //read from file
//            Path path=Paths.get("a1.txt");
//            List<String> list =Files.readAllLines(path);
//            System.out.println(list);

//        Random random=new Random();
//
//        int randomNumber=random.nextInt(0, list.size()-1);
//
//        System.out.println(randomNumber+" "+list.get(randomNumber));

        //writing into the file

        Path p=Paths.get("a2.txt");
        if(!Files.exists(p)){
            Files.createFile(p);
        }

        String msg="welcome to NIO Package";

        //writing a normal string
        Files.write(p, Collections.singleton(msg));

        //writing a list

        List<String> list= Arrays.asList("a","b","c","d","e");
        Files.write(p,list, StandardOpenOption.APPEND);
        Files.write(p,list, StandardOpenOption.APPEND);



        System.out.println("success");
    }
}
