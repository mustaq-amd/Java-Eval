package com.masai;
//You can have only one public outer class in a Java file.
public class SongWithStatic {
    String artist;
    String title; // non-static:  separate for each object of a class
    static int count; //static: common to all objects of a class
    //static variables and methods are accessed using class name
    static int getCount(){
        return count;
    }
    void play(){
        System.out.println(artist+" -> "+title);
    }
}

class ApplicationWithStatic{
    public static void main(String[] args) {
        Song song1=new Song();
        song1.artist="artist1";
        song1.title="title1";

        Song song2=new Song();
        song2.artist="artist2";
        song2.title="title2";

        song1.play();
        song2.play();

        System.out.println(SongWithStatic.count);
        System.out.println(SongWithStatic.getCount());

    }
}


