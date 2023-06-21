package com.company.controlStructured;

public class conditional {
    public static void main(String[] args) {
        // "if statement", "else statement"
        int age= 17;

        if (age >= 18) {
            System.out.println("Is younger");
        } else {
            System.out.println("Is adult");
        }

        // "elseIf statement"
        String day="Saturday";

        if(day.equals("monday")){
            System.out.println("not today");
        } else if (day.equals("tuesday")) {
            System.out.println("not today");
        }

        // switch statement

        switch (day) {
            case "Sunday":
                System.out.println("not today");
                break;
            case "Monday":
                System.out.println("not today");
                break;
            default:
                System.out.println("is today");
        }

    }
}
