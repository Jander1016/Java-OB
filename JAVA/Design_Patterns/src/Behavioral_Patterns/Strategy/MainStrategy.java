package Behavioral_Patterns.Strategy;

import java.util.ArrayList;

public class MainStrategy {
  public static void main(String[] args) {
    UsersFile user = new UsersFile();

    create(user,"Jose");
    create(user,"Luisa");
    create(user,"Maria");
    create(user,"Isabella");
    create(user,"Alexander");

    for ( String names : listUsers(user))
      System.out.println(names);
  }
    public static void create(Users users, String userNames) {
      users.create(userNames);
    }
  public static ArrayList<String> listUsers(Users users) {
    return users.listUsers();
  }
}
