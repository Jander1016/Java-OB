package com.jangodev.springRest.models;

public class Bootcamper {
  private String name;
  private double value;
  public Bootcamper() {}
  public Bootcamper(String name, double value) {
    this.name = name;
    this.value = value;
  }
  public double getValue() { return value; }
  public void setValue(double value) { this.value = value; }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
