package com.company.oops;

public class human_properties {

        int age;
        String name;
        int salary;
        boolean employed;
        static long population;


    public human_properties(int age, String name, int salary, boolean employed) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.employed = employed;
        human_properties.population+= 1;
    }
}
