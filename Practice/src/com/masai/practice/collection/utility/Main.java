package com.masai.practice.collection.utility;

import com.masai.practice.collection.MyComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(25);
        list.add(3);
        list.add(13);
        list.add(9);
        list.add(3);

        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//        Collections.reverse(list);
//        System.out.println(list);

//        Collections.replaceAll(list,3,33);
//        System.out.println(list);

//        Collections.sort(list,new MyComparator());
//        System.out.println(list);

//        int res=Collections.frequency(list,3);
//        System.out.println(res);

        List newList=new ArrayList<>();
        Collections.addAll(list,2,3,4);
        System.out.println(list);



    }
}
