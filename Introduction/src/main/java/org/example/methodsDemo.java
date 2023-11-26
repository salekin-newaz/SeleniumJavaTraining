package org.example;

public class methodsDemo{
    public static void main(String[] args){
        System.out.println("Start programming");
         methodsDemo d = new methodsDemo();
          String name= d.getData();
           System.out.println(name);

        methodsDemo2 md=  new methodsDemo2();
        md.getUserData();

        String name2= getData2();
        System.out.println(name2);

    }


    public String getData(){
        //System.out.println("Hello, World");
        return "pip pip";
    }

    public static String getData2(){
        System.out.println(" This static class, no need to create object for the access");
        return "test";
    }

}
