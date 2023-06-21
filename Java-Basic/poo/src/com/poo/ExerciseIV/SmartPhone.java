package com.poo.ExerciseIV;

public class SmartPhone extends SmartDevice{
  double size;
  public SmartPhone() { }
  public SmartPhone(String name, String description, double price, double size) {
    super(name, description, price);
    this.size = size;
  }
}
