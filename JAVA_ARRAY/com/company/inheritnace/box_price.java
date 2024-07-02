package com.company.inheritnace;

public class box_price extends weight_box{
    double price;

    public box_price(double price) {
        this.price = 55;
    }

    public box_price(double l, double h, double w, double weight, double price) {
        super(l, h, w, weight);
        this.price = price;
    }
}
