package Behavioral_Patterns.Observer;

public class ReceptorTV implements Receptor{
  @Override
  public void receive() {
    System.out.println("Received signal from TV");
  }
}
