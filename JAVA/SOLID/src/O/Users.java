package O;

import java.util.ArrayList;

public class Users {

  UserDBStatistics usersDB = new UserDBStatistics();

  public ArrayList<User> listUsers (){
    return usersDB.convertedUsersFileToArrayList();
  }

  public User getUser(String userName) {
    User user = new User();
    user.userName = userName;

    return usersDB.find(user);
  }

  public void createUser(User user) {
    if (getUser(user.name)!=null) return;
    usersDB.insert(user);
  }

  public void deleteUser(String userName) {
    User user = new User();
    user.userName = userName;
    usersDB.delete(user);
  }

}
