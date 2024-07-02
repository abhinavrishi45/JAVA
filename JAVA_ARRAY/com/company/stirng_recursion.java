package com.company;

public class stirng_recursion {
    public static void main(String[] args) {
        skip("  ", "adjggh");

    }

    static void skip(String useable, String inProcess) {

        if (inProcess.isEmpty()) {
            System.out.println(useable);
            return;
        }
        char ch = inProcess.charAt(0);
        if (ch == 'a') {
            skip(useable, inProcess.substring(1));

        } else {
            skip(useable + ch, inProcess.substring(1));
        }
    }

}

