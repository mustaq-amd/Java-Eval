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
            return e.getKey().equals(company);
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


        Scanner scn=new Scanner(System.in);


        while(true){

            System.out.println("1 Add Mobile");
            System.out.println("2 Show Models");
            System.out.println("Enter any other number to stop");
            System.out.println("Please Enter your choice");

            int choice=scn.nextInt();

            if(choice==1){
                System.out.println("Please Enter Company Name");
                String company=scn.next();
                System.out.println("Please Enter Model Name");
                String model=scn.next();
                String result=mobile.addMobile(company,model);
                System.out.println(result);
            }
            else if(choice==2){
                System.out.println("Please Enter Company Name");
                String company=scn.next();
                List<String> models=mobile.getModels(company);
                System.out.println("Models in "+company+" company are "+models);
            }
            else{
                break;
            }
        }

    }
}
