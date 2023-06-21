package com.poo.ExerciseIV;

public class SmartWatch extends SmartDevice{
  String model;
  public SmartWatch(){}
  public SmartWatch(String name, String description, double price, String model) {
    super(name, description, price);
    this.model = model;
  }
}
