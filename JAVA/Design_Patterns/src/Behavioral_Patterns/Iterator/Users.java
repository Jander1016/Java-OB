package Behavioral_Patterns.Iterator;

import java.util.ArrayList;

public class Users implements UserIterator{
  private int position = 0;
  ArrayList<User> users = new ArrayList<>();

  public void addUser(User user) {
    users.add(user);
  }

  @Override
  public User next() {
    User user = users.get(position);
    position += 1;
    return user;
  }

  @Override
  public void reset() {
    position = 0;
  }

  @Override
  public boolean hasNext() {
    return position < users.size();
  }
}
