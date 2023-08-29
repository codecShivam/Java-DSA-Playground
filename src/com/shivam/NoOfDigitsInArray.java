package com.shivam;

import java.util.Scanner;

public class NoOfDigitsInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int count =0;
        int[] arr = new int[10];
        for(int i=0; i<n; i++)
        {
            arr[i] = in.nextInt();
        }
       for(int i=0; i < n; i++)
       {
           if (arr[i] == 7){
               count++;
           }
       }
        System.out.println(count);

    }
}
