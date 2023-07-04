package Refactor;

public class LargeConstructorBuilder {
  public String brand;
  public String model;
  public String motor;
  public int doors;

  private LargeConstructorBuilder(){}
  public LargeConstructorBuilder(String brand) {
    this.brand = brand;
  }

  public LargeConstructorBuilder withModel(String model){
    this.model = model;
    return this;
  }
  public LargeConstructorBuilder withMotor(String motor){
    this.motor = motor;
    return this;
  }
  public LargeConstructorBuilder withDoors(int doors){
    this.doors = doors;
    return this;
  }
}
