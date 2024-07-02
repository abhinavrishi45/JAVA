package com.company.inheritnace;

public class weight_box extends boxes{
    //extends means to direct mapp the file toh its relatable file
    // or working on the files which is already present in package
   double weight;
    public weight_box(){
        this.weight =1;
    }

    public weight_box(double l, double h, double w, double weight) {
        super(l, h, w); // what os this ? / this keyword is use to get reference from the parent class
        // i.e., weight_box get the details from the boxes.java only for including l,w,h of the boxes not for all classes;
        this.weight = weight;
    }
}
