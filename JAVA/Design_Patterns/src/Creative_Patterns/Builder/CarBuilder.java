package Creative_Patterns.Builder;

public class CarBuilder {
  Vehicle vehicle;

  public CarBuilder(String brand) {
    vehicle = new Vehicle();
    vehicle.brand = brand;
  }
  public CarBuilder setDoors(int doors) {
    vehicle.doors = doors;
    return this;
  }
  public CarBuilder setMotor(String motor){
    vehicle.motor = motor;
    return this;
  }
  public CarBuilder setModel(String model){
    vehicle.model = model;
    return this;
  }
  public Vehicle build() {
    return vehicle;
  }

}
