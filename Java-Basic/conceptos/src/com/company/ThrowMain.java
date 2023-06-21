package com.company;

import java.util.Scanner;

public class ThrowMain {
    public static void main(String[] args) {
        try {
            readNames();
        } catch (NameFormatException ne) {
            ne.printStackTrace();
        }
    }

    /*
    * Method to read names of console and verify that length >= 8
    *characters
    * @throws NameFormatException
    * */
    private static void readNames() throws NameFormatException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("writing names");
        while (keyboard.hasNext()) {
            System.out.println("writing name");
            String name = keyboard.next();
            if (name.length() < 8) {
                keyboard.close();
                throw new NameFormatException("Invalid name minimum length is 8 characters");
            }
        }

    }
}
