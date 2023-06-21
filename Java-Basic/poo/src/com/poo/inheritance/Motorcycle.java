package com.poo.inheritance;

import com.poo.clases.Motor;
import com.poo.clases.Vehicle;

public class Motorcycle extends Vehicle {
  boolean baul;

  public Motorcycle() {
  }

  public Motorcycle(String manufacturer, String model, double cc, int year, boolean sport, Motor motor, boolean baul) {
    super(manufacturer, model, cc, year, sport, motor);
    this.baul = baul;
  }
}
