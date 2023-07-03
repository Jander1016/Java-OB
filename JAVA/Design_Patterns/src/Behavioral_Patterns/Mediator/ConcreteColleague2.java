package Behavioral_Patterns.Mediator;

public class ConcreteColleague2 extends Colleague{
  @Override
  void receive() {
    System.out.println("Receiving message, concreteColleague2");
  }

  @Override
  void send() {
    System.out.println("Sending message from concreteColleague2");
    mediator.resend(this);
  }
}
