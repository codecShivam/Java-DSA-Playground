package com.shivam;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int id = in.nextInt();
        String department = in.next();

        switch (id) {
            case 1 -> System.out.println("Shivam Yadav");
            case 2 -> System.out.println("Menna Yadav");
            case 3 -> {
                System.out.println("Utkarsh Srivastav");
                switch (department) {
                    case  "IT" -> System.out.println("IT");
                    case  "CSE" -> System.out.println("CSE");
                    default -> System.out.println("no department");
                }
            }
            default -> System.out.println("no id");
        }
    }
}
