package com.masai.finalevaluation;

import java.util.*;

public class Mobile {

    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

    public String addMobile(String company, String model) {

        //this method will take a string as a company name and its model as an //argument.
        //ex: "apple", "Iphone13"
        //add the company as key and its model as an element of ArrayList in the above //mobiles HashMap.
        //if the company name already exists then their model should be added to the //existing list.
        //This method should return a message "Mobile added successfully" after //adding a mobile.

        String message="Mobile not added";
        ArrayList<String> models=new ArrayList<>();
        models.add(model);

        if(isExist(company)){

        }

        mobiles.put(company,models);


//        Set<Map.Entry<String, ArrayList<String>>> set=mobiles.entrySet();
//
//        for (Map.Entry<String, ArrayList<String>> mobile:mobiles) {
//
//        }

        System.out.println(mobiles);


        return  message;
    }

    public ArrayList<String> getModels(String company){
        ArrayList<String> list=new ArrayList<>();
        //This method return the list of all the models of the supplied company
        //if we supply any invalid company name then it should return null value

        Set<Map.Entry<String, ArrayList<String>>> set=mobiles.entrySet();
        List<Map.Entry<String, ArrayList<String>>> list1=new ArrayList<>(set);

//        list1.stream().filter(e->{
//        });


        return list;
    }

    boolean isExist(String company){

        mobiles.forEach((e1,e2)->{

            e1.compareTo(company);
        });


        return false;
    }

    public static void main(String[] args) {

        Mobile mobile=new Mobile();
        mobile.addMobile("Apple","Iphone13");
        mobile.addMobile("Apple","Iphone12");


    }
}
