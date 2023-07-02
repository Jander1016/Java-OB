package Behavioral_Patterns.Observer;

public class ReceptorRadio implements Receptor{
  @Override
  public void receive() {
    System.out.println("Received signal from Radio");
  }
}
