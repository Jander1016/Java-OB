package Behavioral_Patterns.State;

public class OpenCamera extends StatePhone{
  public OpenCamera(Phone phone) {
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
    phone.setStatePhone(new GetPhoto(phone));
    return "(getPhoto): Get photo Now";
  }
}
