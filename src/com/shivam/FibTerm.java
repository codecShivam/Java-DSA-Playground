package com.shivam;

import java.util.Scanner;

public class FibTerm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a =0;
        int b=1;
        int count = 0;
        while(count < n - 2)
        {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
