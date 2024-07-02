package com.company;

import java.util.Scanner;
public class Array_kk {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        gety();
    }


    static void gety() {
        Scanner in = new Scanner(System.in);


        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        System.out.println("Enter the elements of array :- ");


        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+ " " );
            }
            System.out.print("\n" );
        }

    }

}
