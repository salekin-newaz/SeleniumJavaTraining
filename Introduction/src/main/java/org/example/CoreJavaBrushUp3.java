package org.example;

public class CoreJavaBrushUp3 {
    public static void main(String[] args){
// String is an object // String literal
        String s= "Salekin Newaz";
        String s1= "Salekin Newaz";
        String s5= "hello";


        //new, it will create new object and memory spaces
        String s2= new String("Welcome");
        String s3= new String("Welcome");

        String sa= "Md Salekin Newaz";
        String[] splitString= sa.split("Salekin");
        System.out.println(splitString[0]);
        System.out.println(splitString[1]);
        System.out.println(splitString[1].trim());
        for(int i=0; i<sa.length();i++){
            System.out.println(sa.charAt(i));
        }
        System.out.println("**************");
        // print reverse
        for( int i= sa.length()-1; i>=0; i--){
            System.out.println(sa.charAt(i));
        }




    }
}
