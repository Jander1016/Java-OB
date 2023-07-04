package Behavioral_Patterns.State;

public class Phone {
  public StatePhone statePhone;

  public Phone() {
    statePhone = new LockPhone(this);
  }

  public void setStatePhone(StatePhone statePhone) {
    System.out.println("Initial statePhone: " + this.statePhone.getClass().getName());
    this.statePhone = statePhone;
    System.out.println("Actual statePhone: " + this.statePhone.getClass().getName());
  }

  public StatePhone getStatePhone() {
    return statePhone;
  }
}
