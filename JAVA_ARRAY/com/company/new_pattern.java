package com.company;

public class new_pattern {
    public static void main(String[] args) {
        newP(4,4);

    }
    static void newP(int r,int c){
        if(r==0){
            return;

        }
        if (c<r){
            System.out.print("*");
            newP(r,c+1);

        }
        else{
            System.out.println();
            newP(r-1,0);
        }
    }
}
