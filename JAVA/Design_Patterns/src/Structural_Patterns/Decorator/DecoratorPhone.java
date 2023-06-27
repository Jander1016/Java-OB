package Structural_Patterns.Decorator;

public class DecoratorPhone implements Phone{
  private final Phone phone;

  public DecoratorPhone(Phone phone) {
    this.phone = phone;
  }

  @Override
  public void create() {
    this.phone.create();
  }
}
