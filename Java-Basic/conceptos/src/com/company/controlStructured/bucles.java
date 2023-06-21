package com.company.controlStructured;

public class bucles {
    public static void main(String[] args) {
        // for

        String[] names = {"Jander", "Alexander", "Isabella", "Raquel"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //forEach

        for (String name : names) {
            System.out.println(name);
        }

        //while

        int count = 0;

        while(count < 10)
            System.out.println(count++);

    }
}
