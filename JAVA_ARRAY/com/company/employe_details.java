package com.company;
import java.util.Scanner;
class employee{
    int id;
    String name;
     public void printdetails(){
         System.out.println("my id is :- " +id);
         System.out.println("my name is " +name );

     }

        }

public class employe_details {
    public static void main(String[] args) {
        employee rishi = new employee();
        rishi.id= 17;
        rishi.name = "abhinav raushan";
        rishi.printdetails();

    }
}
