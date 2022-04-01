package com.masai.finalevaluation;

import java.util.*;
import java.util.stream.Collectors;

public class Mobile {

    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();


    public String addMobile(String company, String model) {

        String message="Mobile not added";

        Set<Map.Entry<String, ArrayList<String>>> set=mobiles.entrySet();
        List <Map.Entry<String, ArrayList<String>>> list=new ArrayList<>(set);

        boolean result=list.stream().anyMatch(e-> {
            return e.getKey()==company;
        });

        ArrayList<String> models=new ArrayList<>();
        models.add(model);

        if(result){
            ArrayList<String> sameCompany= getModels(company);
            sameCompany.add(model);
            mobiles.put(company,sameCompany);
            message="Mobile Added Successfully";

        }else{
            mobiles.put(company,models);
            message="Mobile Added Successfully";
        }


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
        System.out.println(mobile.addMobile("Samsung","S11"));
        System.out.println(mobile.addMobile("Apple","Iphone12"));
        System.out.println(mobile.addMobile("Samsung","S10"));
        System.out.println(mobile.addMobile("Apple","IphoneXR"));


        List<String> models=mobile.getModels("Apple");
        System.out.println(models);

        List<String> models1=mobile.getModels("Samsung");
        System.out.println(models1);


    }
}
