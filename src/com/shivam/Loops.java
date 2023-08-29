package com.shivam;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n=1;
//        do {
//          System.out.println(n);
//          n++;
//        } while (n<=5);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(Math.max(c,Math.max(a,b)));

        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max) {
            max = c;
        }
        System.out.println(max);


        if(a>b){
            if(a > c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }
        else {
            if(b > c) {
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }

    }
}
