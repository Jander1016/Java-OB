package Structural_Patterns.Decorator;

public class NextGenPhone extends DecoratorPhone{
  public NextGenPhone(Phone phone) {
    super(phone);
  }

  @Override
  public void create() {
    super.create();
    System.out.println("Next Generation Phone:  -> 5G");
    System.out.println("Next Generation Phone:  -> VoLTE");
  }
}
