package ErrorHandling;

import java.util.Arrays;

public class MainError {
  public static void main(String[] args) {
    Users user = new Users();
    try {
      user.addUser("Juanito");
      user.addUser("Pepe");
      user.addUser("Pepe");
      user.addUser("Julia");
    } catch (UsersException e) {
      System.out.println(e.getMessage());
    }
  }
}
