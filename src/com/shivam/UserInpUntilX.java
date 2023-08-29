package com.shivam;

import java.util.Scanner;

public class UserInpUntilX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arr = new char[100];
        for(int i=0 ; i<100; i++){
            arr[i] = in.next().trim().charAt(0);
            if(arr[i] == 'x' || arr[i] == 'X')
            {
                break;
            }
        }
    }
}
