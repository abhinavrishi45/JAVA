package com.company;

public class search_in_darr {
    public static void main(String[] args) {
        int []num  ={ 5,10,15,25,36};
        int target =16;
        boolean ans =search2(num,target);
        System.out.println(ans);


    }
//    static int  search(int arr[],int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//
//        for (int index = 0; index < arr.length; index++) {
//            int element = arr[index];
//            if (element == target) {
//                return index;
//            }
//
//        }
//        return 0;
//
//
//    }

    static boolean search2(int arr[],int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return true;
            }

        }


        return false;
    }
}
