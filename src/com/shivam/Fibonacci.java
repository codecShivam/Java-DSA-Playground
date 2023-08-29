package com.shivam;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = 0;
        int b = 1;
        if (n==1)
            System.out.println(a);
      else  if (n==2) {
            System.out.println(a);
            System.out.println(b);
        }

      else {
            System.out.println(a);
            System.out.println(b);
          int c;
          for(int i = 0 ; i< n-2 ; i++)
          {
              c = a + b;
              System.out.println(c);
              a = b;
              b = c;
          }
        }
    }
}
