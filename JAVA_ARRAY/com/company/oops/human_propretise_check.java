package com.company.oops;


public class human_propretise_check {
    public static void main(String[] args) {
     // static does not depends on object
        // we does not use "this." methods in statics

        human_properties rishi = new human_properties(4, "abhinav", 10000, true);
        human_properties abhinav = new human_properties(5, "rishi", 500000, true);
        human_properties shreyash = new human_properties(6, "shreyash", 4000000, true);

        System.out.println(human_properties.population);
        System.out.println(human_properties.population);
        System.out.println(human_properties.population);
    }
}
