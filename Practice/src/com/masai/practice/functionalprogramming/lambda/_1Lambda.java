package com.masai.practice.functionalprogramming.lambda;

public class _1Lambda {
    public static void main(String[] args) {



        // 1st way Implement the Interface(normal)


        // 2nd way Anonymous inner class way

        MyFunctionalInterface myFunctionalInterface= new MyFunctionalInterface(){
            @Override
            public void hello(String name) {
                System.out.println("Helloooo "+name);
            }
        };

        // 3rd way no class name, no function name, no input data type

        MyFunctionalInterface myFunctionalInterface1=(name)->{
            System.out.println("Haiiiiii "+name);
        };

        myFunctionalInterface.hello("Mustaq");
        myFunctionalInterface1.hello("Virat");


        // another interface
        MyFunctionalInterafaceNoInputMethod myFunctionalInterafaceNoInputMethod=()->System.out.println("Byeeeee");


        myFunctionalInterafaceNoInputMethod.bye();
    }
}

@FunctionalInterface
interface MyFunctionalInterface{
    void hello(String name);

}

@FunctionalInterface
interface MyFunctionalInterafaceNoInputMethod{
    void bye();
}
