package com.company;

public class Functions {
  public static void main(String[] args) {
    double price = 19.9;
    double iva = calculateIVA(price);
    System.out.println("Price total is: " + (price + iva));
  }

  static double calculateIVA (double price){
    return price * 0.18;
  }
}
