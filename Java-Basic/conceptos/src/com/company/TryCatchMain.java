package com.company;

public class TryCatchMain {
    public static void main(String[] args) {
        try {
            int result = 120/0;
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {
            System.out.println("close resources");
        }
        System.out.println("fin");
    }
}
