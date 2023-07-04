package Behavioral_Patterns.State;

public class UnlockPhone extends StatePhone{
  public UnlockPhone(Phone phone) {
    super(phone);
  }

  @Override
  public String unlockPhone() {
    return "unlockPhone(): The phone is unlocked actually";
  }

  @Override
  public String openCamera() {
    phone.setStatePhone(new OpenCamera(phone));
    return "openCamera(): The camera is ready";
  }

  @Override
  public String getPhoto() {
    return "(getPhoto): The camera is currently locked";
  }
}
