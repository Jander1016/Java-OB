package Behavioral_Patterns.Mediator;

public class ConcreteColleague3 extends Colleague{
  @Override
  void receive() {
    System.out.println("Receiving message, concreteColleague3");
  }

  @Override
  void send() {
    System.out.println("Sending message from concreteColleague3");
    mediator.resend(this);
  }
}
