package com.masai;

public class Song {
    String artist;
    String title;

    void play(){
        System.out.println(artist+" -> "+title);
    }

    public static void main(String[] args) {

        Song s1=new Song();
        s1.artist="Mustaq";
        s1.title="Kadalalle";

        Song s2=new Song();
        s2.artist="Virat";
        s2.title="Chalo";

        s1.play();
        s2.play();



    }
}
