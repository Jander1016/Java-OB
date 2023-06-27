package Structural_Patterns.Decorator;

public class SmartPhone extends DecoratorPhone{
  public SmartPhone(Phone phone) {
    super(phone);
  }

  @Override
  public void create() {
    super.create();
    System.out.println("SmartPhone -> 4G");
  }
}
