package com.shivam;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class NoOfDigitsInNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count =0;
        int n = in.nextInt();
        while(n > 0){
            if(n%10 == 7){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
