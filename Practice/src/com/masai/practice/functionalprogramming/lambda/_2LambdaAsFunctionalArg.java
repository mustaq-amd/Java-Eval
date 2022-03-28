package com.masai.practice.functionalprogramming.lambda;

public class _2LambdaAsFunctionalArg {

    public static void main(String[] args) {

        Calculator addition=(a,b)->a+b;
        Calculator subtraction=(a,b)->a-b;
        Calculator multiplication=(a,b)->a*b;


        // one way
        int sum=addition.calculate(2,3);
        System.out.println(sum);


        // another way
        // (Strategy Pattern)->without changing the method and interface, able to do n number of operations
        System.out.println(takinglambdaAsArgument(10,20,addition));
        System.out.println(takinglambdaAsArgument(10,20,subtraction));

    }


    public static int takinglambdaAsArgument(int a, int b, Calculator calculator){
        return calculator.calculate(a,b);
    }


}


@FunctionalInterface
interface Calculator{
    int calculate(int a,int b);
}
