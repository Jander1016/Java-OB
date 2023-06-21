package com.poo.clases;

public class Motor {
  String model;
  int horsepower;
  double parNm;
  int numberOfChannels;

  public Motor(String model, int horsepower, double parNm, int numberOfChannels) {
    this.model = model;
    this.horsepower = horsepower;
    this.parNm = parNm;
    this.numberOfChannels = numberOfChannels;
  }

  @Override
  public String toString() {
    return "Motor{" +
            "model='" + model + '\'' +
            '}';
  }
}
