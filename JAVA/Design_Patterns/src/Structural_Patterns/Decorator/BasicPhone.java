package Structural_Patterns.Decorator;

public class BasicPhone implements Phone{

  @Override
  public void create() {
    System.out.println("I'm basic phone, I have these characteristics");
    withGSM();
    withSMS();
  }
  private void withGSM() {
    System.out.println("  -> GSM");
  }

  private void withSMS() {
    System.out.println("  -> SMS");
  }
}
