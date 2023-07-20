package S;

public class User {
  public String userName;
  public String name;
  public String lastName;
  public String  email;
  public int accessLevel;

  @Override
  public String toString() {
    return "Name User: " + userName + "\r\n"
        + "Name: " + name + "\r\n"
        + "Last Name: " + lastName + "\r\n"
        + "Email: " + email + "\r\n"
        + "Access Level: " + accessLevel + "\r\n"
        ;
  }
}
