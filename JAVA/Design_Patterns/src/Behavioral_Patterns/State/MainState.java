package Behavioral_Patterns.State;

public class MainState {
  public static void main(String[] args) {
    Phone phone1 = new Phone();

    System.out.println(phone1.statePhone.unlockPhone());
    System.out.println(phone1.statePhone.getPhoto());
    System.out.println(phone1.statePhone.openCamera());
    System.out.println(phone1.statePhone.getPhoto());
    System.out.println(phone1.statePhone.getPhoto());

    System.out.println(phone1.statePhone.getPhoto());

  }
}
