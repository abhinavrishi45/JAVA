package com.company;

public class largest_element_in_Array {
    public static void main(String[] args) {
        int [] arr = new int [] {25, 11, 7, 75, 18696};

        int max = arr[0];
        //Loop through the array
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);
    }
}
