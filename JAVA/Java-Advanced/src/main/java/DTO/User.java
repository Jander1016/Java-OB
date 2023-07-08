package DTO;

import java.util.ArrayList;

public class User {
  private String userName;
  ArrayList<Vehicle> vehicle = new ArrayList<>();
  private User() { }

  public User(String userName) {
    this.userName = userName;
  }

  public String getUserName() {
    return userName;
  }

  public void addVehicle(Vehicle vehicle) {
    this.vehicle.add(vehicle);
  }
}
