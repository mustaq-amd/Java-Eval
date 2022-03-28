package com.masai.practice.filehandling;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class FileHandlingIOPackage {
    public static void main(String[] args) throws IOException {

        //creating a file
//            File f=new File("a1.txt");
//            if(f.createNewFile()){
//                System.out.println(f+" file has been created successfully");
//            }else{
//                System.out.println(f+" file is already exists");
//            }

        //checking a file exists or not
            //System.out.println(f.exists());

        //creating a directory/folder
//            File f=new File("myFileFolder");
//            if(f.mkdir()){
//                System.out.println(f+" Folder Created successfully");
//            }else{
//                System.out.println((f+" Folder already exists"));
//            }

        //retrieving all files and folders in a  particular directory
//            File f=new File("myFileFolder//a");
//            String[] list=f.list();
//            System.out.println(Arrays.toString(list));

        //retrieving all files directory and their subdirectories
//            File f=new File("myFileFolder//a");
//            getFiles(f);


        //writing inside the file using FileWriter

//            FileWriter fw = new FileWriter("a1.txt",true);
//            fw.write(100);//d will be added
//            fw.write("ramesh\nwelcome");
//            fw.write("\n");
//            fw.write("india");
//            fw.write("\n");
//            char ch[]={'a','b','c'};
//            fw.write(ch);
//            fw.flush();
//            fw.close();
//            System.out.println("done");

        //one way of reading from the file from FileReader

//            FileReader fr=new FileReader("a1.txt");
//            int i=fr.read();
//            while( i != -1) {
//                //System.out.print(i+" ");
//                System.out.print((char)i);
//                i = fr.read();
//            }



        //another way of reading from the file from FileReader

//            File f=new File("a1.txt");
//            FileReader fr=new FileReader(f);
//            char[] chr=new char[(int)f.length()];
//            fr.read(chr);
//            for(char c:chr){
//                System.out.print(c);
//            }

        //writing inside the file using BufferedWriter

//            FileWriter fw = new FileWriter("a1.txt");
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write(100);//d will be added
//            bw.newLine(); //inserting a new line
//            bw.write("ramesh");
//            bw.newLine();
//            bw.write("india");
//            bw.newLine();
//            char ch[]={'a','b','c'};
//            bw.write(ch);
//            bw.flush();
//            bw.close();
//            System.out.println("done");

        //reading from the file using BufferedReader

//            FileReader fr=new FileReader("a1.txt");
//            BufferedReader br=new BufferedReader(fr);
//            String line=br.readLine();
//            while(line != null){
//                System.out.println(line);
//                line=br.readLine();
//            }
//            br.close();

        //writing into the file using PrintWriter

//            FileWriter fw=new FileWriter("a1.txt",true);
//            PrintWriter out=new PrintWriter(fw);
//            //or
//            // PrintWriter out=new PrintWriter("a1.txt");
//            out.write(100);//d will be added
//            out.println(100);
//            out.println(true);
//            out.println('c');
//            out.println("amit");
//            out.flush(); //need not call the flush method
//            out.close();
//            System.out.println("done..");






    }

//    public static void getFiles(File f){
//
//        File[] files=f.listFiles();
//
//        for (File file:files) {
//
//            if(file.isDirectory()){
//                getFiles(file);
//            }
//            else{
//                System.out.println(file.getName());
//            }
//
//        }
//
//    }
}
