package Structural_Patterns.Decorator;

public class MainDecorator {
  public static void main(String[] args) {
    NextGenPhone basicPhone = new NextGenPhone(
            new SmartPhone(new BasicPhone()));
    basicPhone.create();


  }
}
