package com.masai.evaluation.c3.problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayList {

    List<Song> songs=new ArrayList<>();

    public void addSong(){
        Scanner scn=new Scanner(System.in);

        System.out.println("Please Enter Movie Name");
        String movieName=scn.next();

        System.out.println("Please Enter Song Name");
        String songName=scn.next();

        songs.add(new Song(movieName,songName));
    }
}
