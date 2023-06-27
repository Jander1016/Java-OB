package Creational_Patterns.Prototype;

public class Car implements Cloneable{
  public String brand;
  public String model;
  public int doors;

  public Car cloneCar() throws CloneNotSupportedException {
    return (Car)this.clone();
  }

}
