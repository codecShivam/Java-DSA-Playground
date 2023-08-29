package com.shivam;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("red");
            default -> System.out.println("please enter a valid fruit");
        }
    }
}
