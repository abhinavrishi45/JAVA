package com.company;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class greeting {
    public static void main(String[] args) {
        String personalised =mygreet("abhinav");
        System.out.println(personalised);


    }

    static @NotNull String mygreet(String name){
        String s = "hello " + name;
        return s;
    }
}