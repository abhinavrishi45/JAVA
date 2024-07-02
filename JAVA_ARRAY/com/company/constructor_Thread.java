package com.company;

class MyThr extends Thread{  // here we don't use implements
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}

public class constructor_Thread {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Rahul");
        MyThr t2 = new MyThr("Sunny");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());
        // getId is used for getting the thread id
        //The getId() method is used to return the thread identifier.
        // The thread ID is a unique positive number which was generated at the time of thread creation.
        // The thread ID remains unchanged during its lifetime.
        // When the thread is terminated, the ID of thread can be reused.
        System.out.println("The name of the thread t is " + t1.getName());
        System.out.println("The id of the thread t is " + t2.getId());
        System.out.println("The name of the thread t is " + t2.getName());
        // there are various type of getId,getName,.....e.t.c.

    }
}




