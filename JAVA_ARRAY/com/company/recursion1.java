package com.company;

public class recursion1 {
    public static void main(String[] args) {
       // rev(5);
        //oppositeRev(5);
        bothRev(5);

    }
    static void rev(int n){
        if(n==0) {
            return;
        }
        System.out.println(n);
        rev(n-1);

    }
    static void oppositeRev(int n){
        if(n==0) {
            return;
        }
        //System.out.println(n);
        oppositeRev(n-1);
        System.out.println(n);

    }
    static void bothRev(int n ){
        if(n==0) {
            return;
        }
        System.out.println(n);
        bothRev(n-1);
        System.out.println(n);

    }
}
