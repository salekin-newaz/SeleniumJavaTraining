package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {
    public static void main(String[] args){

        int arr[]= {1,2,3,4,5,6,7,8};

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
            else {
                System.out.println(arr[i]+ " is not multiply by two");
            }
        }
        ArrayList<String> a= new ArrayList<String>();
        // create a object of the class - object.method
       a.add("Md Salekin");
       a.add("Newaz");
       a.add("Sami");
       System.out.println(a.get(2));

       for( int i=0; i<a.size();i++){
           System.out.println(a.get(i));
       }

       // Enhanced For loop
        for( String val: a){
            System.out.println(val+ ", This is for enhanced for loop");
        }

        // Item is present in ArrayList
        System.out.println("**********");
        System.out.println(a.contains("Sami"));
        //ArrayList<String> a= new ArrayList<String>();
     // Traditional array to convert Arraylist
        System.out.println("**********");
        String[] namee= {"sami", "abir", "monika"};
        List<String> nameArrayList= Arrays.asList(namee);
        System.out.println(nameArrayList.contains("monikaa"));


    }



}
