package com.company;

public class String_recursion_skip
{
    public static void main(String[] args) {

        System.out.println(skipApple("sjaaapplefab"));

    }
    static String skip(String inProcess) {

        if (inProcess.isEmpty()) {
            return " ";
        }
        char ch = inProcess.charAt(0);
        if(ch == 'a') {
           return skip(inProcess.substring(1));

        } else {
           return ch+skip( inProcess.substring(1));
        }

    }
    static String skipApple(String inProcess) {

        if (inProcess.isEmpty()) {
            return " ";
        }
        if(inProcess.startsWith("apple")) {
            return skipApple(inProcess.substring(5));

        } else {
            return inProcess.charAt(0)+skipApple( inProcess.substring(1));
        }

    }

}
