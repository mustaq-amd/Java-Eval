package com.masai.evaluation.c3.problem4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    PlayList playList=new PlayList();
    Scanner scn=new Scanner(System.in);
        while(true){
            playList.addSong();

            System.out.println("Want more y/n");
            String choice=scn.next();

            if(choice.equalsIgnoreCase("n")){
                break;
            }

        }

        for (Song song : playList.songs) {
            song.play();

        }

    }
}
