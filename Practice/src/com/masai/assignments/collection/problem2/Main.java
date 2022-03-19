package com.masai.assignments.collection.problem2;

import com.masai.assignments.collection.problem1.Employee;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        Set<Product> products=new TreeSet<>(new ProductSortId());

        Scanner scn=new Scanner(System.in);

        System.out.println("Enter 1 to sort with price, 2 to sort with name, 3 to sort with Id");

        int choice=scn.nextInt();

        if(choice==1){
            products=new TreeSet<>(new ProductSortPrice());
        }
        if(choice==2){
            products=new TreeSet<>(new ProductSortName());
        }
        if(choice==3){
            products=new TreeSet<>(new ProductSortId());
        }



        while(true){

            System.out.println("Please Enter Product ID");
            int productId= scn.nextInt();

            System.out.println("Please Enter Product Name");
            String productName= scn.next();

            System.out.println("Please Enter Product price");
            double price= scn.nextDouble();

            products.add(new Product(productId,productName,price));

            System.out.println("Want more y/n");
            String more= scn.next();

            if(more.equalsIgnoreCase("n")){
                break;
            }

        }


        for (Product product:products) {
            System.out.println(product);

        }

    }
}
