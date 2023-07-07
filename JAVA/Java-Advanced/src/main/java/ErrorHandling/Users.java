package ErrorHandling;

import java.util.ArrayList;

public class Users {
  ArrayList<String> users = new ArrayList<>();

  public void addUser(String nameUser) throws UsersException {
    for (String user: users) {
      if(user.equals(nameUser)){
        throw new UserRegisteredException(nameUser);
      }
    }
    users.add(nameUser);
  }
}
