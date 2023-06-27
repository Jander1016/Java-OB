package Structural_Patterns.Adapter;

public class Lamp implements Pluggable{
  boolean turnOnPattern= false;
  @Override
  public void turnON() {
    turnOnPattern=true;
    System.out.println("lamp turn on");
  }

  @Override
  public void turnOff() {
    turnOnPattern=false;
    System.out.println("Lamp turn off");
  }

  @Override
  public boolean isTurnOn() {
    return turnOnPattern;
  }
}
