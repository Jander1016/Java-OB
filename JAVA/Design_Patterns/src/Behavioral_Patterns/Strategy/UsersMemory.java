package Behavioral_Patterns.Strategy;

import java.util.ArrayList;

public class UsersMemory implements Users{
  ArrayList<String> users = new ArrayList<String>();
  @Override
  public void create(String user) {
    users.add(user);
  }

  @Override
  public ArrayList<String> listUsers() {
    return users;
  }
}
