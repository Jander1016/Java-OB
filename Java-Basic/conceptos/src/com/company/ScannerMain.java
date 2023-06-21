package com.company;

import java.util.Scanner;
import java.util.Stack;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name=scanner.nextLine();
        System.out.println("Enter a number");
        int number= scanner.nextInt();

        System.out.println("The name is: " + name);
        System.out.println("The number is: " + number);

        System.out.println("Hello world");
    }
}
