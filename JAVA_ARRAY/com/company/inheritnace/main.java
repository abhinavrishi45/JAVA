package com.company.inheritnace;

public class main {
    public static void main(String[] args) {
        //class object = new class;
        //where obj is newly made obj; class is made up of either this keyword or by the propery of the object
        // just like human property and else
        boxes box = new boxes(4);;
        weight_box box2 = new weight_box();
        weight_box box3 =  new weight_box(4,5,6,7);
        box_price box4 = new box_price(5,5 ,5 , 4, 55 );

       // System.out.println(box.h+""+ box.l+""+ box.h);
        System.out.println(box2.h+ " "+ box2.l+ " "+ box2.weight);
        System.out.println(box4.h+ " "+ box4.l+ " "+ box4.weight+" "+ box4.price);

    }
}
