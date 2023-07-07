package ErrorHandling;

public class UsersException extends Exception{
  public UsersException(String message) {
    super("Error in register -> "+ message);
  }

}
