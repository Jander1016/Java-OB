package Structural_Patterns.Adapter;

public class Lightbulb {
  boolean poweredOn = false;
  int voltage = 0;
  public void setPoweredOn(int voltage) {
    poweredOn=true;
    this.voltage = voltage;
    System.out.println("Light bulb poweredOn with voltage: " + voltage + " of current");
  }
  public void setPoweredOff(){
    poweredOn = false;
    this.voltage = 0;
    System.out.println("Light bulb poweredOff");
  }

  public boolean isPoweredOnLB() {
    return poweredOn;
  }
}
