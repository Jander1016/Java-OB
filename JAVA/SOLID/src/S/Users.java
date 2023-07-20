package S;

import java.util.ArrayList;

public class Users {

  UsersDB usersDB = new UsersDB();

  public ArrayList<User> listUsers (){
    return usersDB.convertedUsersFileToArrayList();
  }

  public User getUser(String username) {
    ArrayList<User> users = usersDB.convertedUsersFileToArrayList();

    for (User actualUser: users) {
      if (actualUser.name.equalsIgnoreCase(username)) return actualUser;
    }

    return null;
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
