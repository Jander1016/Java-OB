package Behavioral_Patterns.State;

abstract public class StatePhone {
  public Phone phone;

  public StatePhone(Phone phone) {
    this.phone = phone;
  }

  abstract public String unlockPhone();
  abstract public String openCamera();
  abstract public String getPhoto();
}
