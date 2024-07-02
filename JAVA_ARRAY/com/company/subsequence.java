package com.company;

public class subsequence {
    public static void main(String[] args) {
        seque("","abc");

    }
    static void seque(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;

        }
        char ch =  up.charAt(0);
        seque(p+ch,up.substring(1));
        seque(p,up.substring(1));

    }
}
