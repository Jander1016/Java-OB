package Behavioral_Patterns.Mediator;

public class ConcreteColleague1 extends Colleague{
  @Override
  void receive() {
    System.out.println("Receiving message, concreteColleague1");
  }

  @Override
  void send() {
    System.out.println("Sending message from concreteColleague1");
    mediator.resend(this);
  }
}
