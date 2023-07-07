package ErrorHandling;

public class UserRegisteredException extends UsersException{
  public UserRegisteredException(String message) {
    super("User already exists -> " + message);
  }
}
