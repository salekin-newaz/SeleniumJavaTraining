package org.example;

public class CoreJavaBrushUp1 {
    public static void main(String[] args){
        int number= 5;
        String website= "Rahut Shetty Academy";
        char letter= 'r';
        double dec= 5.99;
        boolean myCard= true;

        System.out.println(number+ " this is a number");
    //  Array
    int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // String array
    for(int i=0; i<arr.length; i++){
    System.out.println(arr[i]);
    }

    String[] name= {"Salekin", "Newaz", "sami"};
    for (int i=0; i<name.length;i++){
        System.out.println(name[i]);
    }

    // Enhanced For loop Decleration

        for(String s : name){
            System.out.println(s);
        }







    }
}
