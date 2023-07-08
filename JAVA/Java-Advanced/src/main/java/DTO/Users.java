package DTO;

import java.util.ArrayList;

public class Users {
  ArrayList<User> users = new ArrayList<>();

  public User getUsers(String userName) {
    for (User user : users) {
      if (user.getUserName().equalsIgnoreCase(userName)) {
          return user;
      }
    }
    return null;
  }

  public void addUser(User user){
    users.add(user);
  }
}
