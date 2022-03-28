package com.masai.evaluation.c3.problem4;

import java.util.*;

public class PlayList {

   public List<Song> songs=new ArrayList<>();

    public void addSong(){
        Scanner scn=new Scanner(System.in);

        System.out.println("Please Enter Movie Name");
        String movieName=scn.next();

        System.out.println("Please Enter Song Name");
        String songName=scn.next();

        boolean res=songs.contains(new Song(movieName,songName));

        if(res)
            System.out.println("Song is already added in the playlist");
        else{
            songs.add(new Song(movieName,songName));
            System.out.println("Song added to the playlist successfully.");
        }




    }
}
