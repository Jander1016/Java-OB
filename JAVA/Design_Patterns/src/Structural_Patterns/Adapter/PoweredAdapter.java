package Structural_Patterns.Adapter;

public class PoweredAdapter implements Pluggable{

  Lightbulb lightbulb = new Lightbulb();
  @Override
  public void turnON() {
    lightbulb.setPoweredOn(110);
  }

  @Override
  public void turnOff() {
    lightbulb.setPoweredOff();
  }

  @Override
  public boolean isTurnOn() {
    return lightbulb.isPoweredOnLB();
  }
}
