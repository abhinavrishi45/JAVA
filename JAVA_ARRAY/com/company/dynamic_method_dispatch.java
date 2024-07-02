package com.company;


class keypad{ // this is super set
    public int nokia(){
        System.out.println("This is nokia , this is a just a simple keypad phone");
        return 1;

    }
    public int samsung(){
        System.out.println("this is also a phone having mp3 player");
        return 1;
    }
}
class smartphones extends keypad{ // this is subset
    public int NOKIA() {
        System.out.println("this is nokia smartphone");
        return 1;
    }

    @Override
    public int samsung() {
        System.out.println("This is samsung smartphones");
        return 1;
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
       //keypad nokia3300 = new keypad();
        // nokia3300.nokia();

        //smartphones samsung21 = new smartphones();
         //samsung21.samsung();

       //smartphones nokia2200 = new keypad();
        //[ this is throwing error bcz smartphone is subset and referenced obj is superset]


        keypad samsung25 = new smartphones(); // this is dynamic dispatch
        // reference hai keypad ka object ha smartphone ka
        // object ka run hoga reference ka nhi ,
        // yaha par object samsung 25 jo h ek object hai jo ki overiding kr rha hai;
        // jo pehle reference diya gya as a keypad[ -- subset ka run nhi hoga superset ka hoga]
        // phir usko smartphone bna diya gya , toh wo as a wsmartphone hi kaam krrega;
         samsung25.samsung();



    }
}
