package com.company.getters_setters;
class truth{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
// getter and setter is used in class , and it is used by referring the object
public class file1 {
    public static void main(String[] args) {
        truth expert = new truth(); //yaha par maine expert naam ka objeect bnaya
        expert.x = 5;  // yaha par expert name ka object mein value store kiya;
        System.out.println(expert.getX());

    }
}
