package Structural_Patterns.Adapter;

public class MainAdapter {
  public static void main(String[] args) {
    Oven oven = new Oven();
    Lamp lamp = new Lamp();
    PoweredAdapter lightbulb = new PoweredAdapter();

    turnOff(oven);
    turnOn( lamp );
    turnOn( lightbulb );

  }
  public static void turnOn(Pluggable pluggable){
    pluggable.turnON();
  }

  public static void turnOff(Pluggable pluggable){
    pluggable.turnOff();
  }

  public static boolean isOn(Pluggable pluggable){
    return pluggable.isTurnOn();
  }

}
