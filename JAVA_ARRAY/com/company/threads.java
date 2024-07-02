package com.company;
// Thread is type pre defined class in java we dont need to define it
// we need to define the thread thorugh the run() method.
// thread is used  to get parallel output.
// example : we need a output to get two different sentences many time then we use threads


    class MyThread1 extends Thread{
        @Override
        public void run(){
            int i =0;
            while(i<40000){
                System.out.println("My Cooking Thread is Running");
                System.out.println("I am happy!");
                i++;
            }
        }
    }

    class MyThread2 extends Thread{
        @Override
        public void run(){
            int i =0;
            while(i<40000){
                System.out.println("Thread 2 for Chatting with her");
                System.out.println("I am sad!");
                i++;
            }
        }
    }

public class threads {
        public static void main(String[] args) {
            MyThread1 t1 = new MyThread1();
            MyThread2 t2 = new MyThread2();
            t1.start();                        // this is compulsory to start the execution of program
            t2.start();                        // it refers the to start the class execution

        }
    }






