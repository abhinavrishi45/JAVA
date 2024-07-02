package com.company;
import java.util.Scanner;

public class search_in_Arr
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = in.nextInt();
        int [] array = new int[n];
        System.out.println("Enter those " + n + " elements");
        for (int c = 0; c < n; c++)
            array[c] = in.nextInt();

        System.out.println("Enter value to find");
        int search = in.nextInt();
        for (int c = 0; c < n; c++)
        {
            if (array[c] == search)     /* Searching element is present */
            {
                System.out.println(search + " is present at location " + (c + 1) + ".");
                break;
            }
        }
        byte c = 0;
        if ( c == n)  /* Element to search isn't present */
            System.out.println(search + " isn't present in array.");
    }

}

