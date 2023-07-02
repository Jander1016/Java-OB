package Behavioral_Patterns.Observer;

public class ReceptorSatellite implements Receptor{
  @Override
  public void receive() {
    System.out.println("Received signal from Satellite");
  }
}
