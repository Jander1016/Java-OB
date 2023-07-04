package Behavioral_Patterns.State;

public class LockPhone extends StatePhone{
  public LockPhone(Phone phone) {
    super(phone);
  }
  @Override
  public String unlockPhone() {
    phone.setStatePhone(new UnlockPhone(phone));
    return "unlockPhone(): The phone is now unlocked";
  }

  @Override
  public String openCamera() {
    return "(OpenCamera): The phone is currently locked, locked phone";
  }

  @Override
  public String getPhoto() {
    return "(getPhoto): The camera is currently locked";
  }
}
