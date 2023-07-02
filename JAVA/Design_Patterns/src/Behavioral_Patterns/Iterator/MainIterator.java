package Behavioral_Patterns.Iterator;

public class MainIterator {
  public static void main(String[] args) {
    Users newUsers = new Users();

    newUsers.addUser(new User("John", 24));
    newUsers.addUser(new User("Luisa", 20));
    newUsers.addUser(new User("Maria", 23));
    newUsers.addUser(new User("Juan", 39));

    while (newUsers.hasNext()){
      User user = newUsers.next();
      System.out.println("User: " + user.getName() + " and has age: " + user.getAge());
    }

    newUsers.reset();

    newUsers.addUser(new User("Julia", 34));
    User user = newUsers.next();
    System.out.println(user.getName() + " has age: " + user.getAge());

    while (newUsers.hasNext()){
      user = newUsers.next();
      System.out.println("User: " + user.getName() + " and has age: " + user.getAge());
    }
  }

}
