package com.masai.finalevaluation;

import java.util.*;
import java.util.stream.Collectors;

public class Mobile {

    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

    public String addMobile(String company, String model) {

        String message="Mobile not added";

        Set<Map.Entry<String, ArrayList<String>>> set=mobiles.entrySet();
        List <Map.Entry<String, ArrayList<String>>> list=new ArrayList<>(set);

        ArrayList<String> models=new ArrayList<>();
        models.add(model);


        boolean result=list.stream().anyMatch(e-> {
            return e.getKey()==company;
        });

        if(result){
            models.add(model);
            mobiles.put(company,models);
            message="Mobile Added Successfully";

        }else{
            mobiles.put(company,models);
            message="Mobile Added Successfully";
        }
        System.out.println(mobiles);


        return  message;
    }

    public ArrayList<String> getModels(String company){
        ArrayList<String> list=null;

        list=mobiles.get(company);

        return list;
    }



    public static void main(String[] args) {

        Mobile mobile=new Mobile();
        System.out.println(mobile.addMobile("Apple","Iphone13"));


        List<String> models=mobile.getModels("Apple");
        System.out.println(models);


    }
}
