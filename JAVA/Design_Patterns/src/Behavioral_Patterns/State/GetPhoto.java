package Behavioral_Patterns.State;

public class GetPhoto extends StatePhone {
  public GetPhoto(Phone phone) {
    super(phone);
  }

  @Override
  public String unlockPhone() {
    return "unlockPhone(): The phone is unlocked actually";
  }

  @Override
  public String openCamera() {
    return "openCamera(): The camera is ready";
  }

  @Override
  public String getPhoto() {
    phone.setStatePhone(new LockPhone(phone));
    return "(getPhoto): the photo has been taken";
  }
}
