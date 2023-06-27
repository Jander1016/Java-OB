package Structural_Patterns.Adapter;

public class Oven implements Pluggable{

  boolean turnOnPattern = false;
  @Override
  public void turnON() {
    turnOnPattern = true;
    System.out.println("Oven turn on");
  }

  @Override
  public void turnOff() {
    turnOnPattern = false;
    System.out.println("Oven turn off");
  }

  @Override
  public boolean isTurnOn() {
    return turnOnPattern;
  }
}
