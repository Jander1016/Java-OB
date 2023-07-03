package Behavioral_Patterns.Mediator;

public class MainMediator {
  public static void main(String[] args) {
    Mediator mediator = new ConcreteMediator();

    Colleague colleague1 = new ConcreteColleague1();
    Colleague colleague2 = new ConcreteColleague2();
    Colleague colleague3 = new ConcreteColleague3();

    mediator.register(colleague1);
    mediator.register(colleague2);
    mediator.register(colleague3);

    colleague1.send();
    colleague2.send();
    colleague3.send();

  }
}
