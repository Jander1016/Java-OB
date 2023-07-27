package O;

public class MainO {
  public static void main(String[] args) {
    User user1 = new User();
    user1.userName = "OpenBootcamp";
    user1.name = "Open";
    user1.lastName = "Bootcamp";
    user1.email = "example@open-bootcamp.com";
    user1.accessLevel = 1;

    User user2 = new User();
    user2.userName = "OpenBootcamp2";
    user2.name = "Open2";
    user2.lastName = "Bootcamp2";
    user2.email = "example2@open-bootcamp.com";
    user2.accessLevel = 2;

    User user3 = new User();
    user3.userName = "OpenBootcamp3";
    user3.name = "Open3";
    user3.lastName = "Bootcamp3";
    user3.email = "example3@open-bootcamp.com";
    user3.accessLevel = 3;

    Users users = new Users();
    users.createUser(user1);
    users.createUser(user2);
    users.createUser(user3);

    //users.deleteUser("OpenBootcamp");
    for (User user : users.listUsers()) {
      System.out.println("User Actual: " + user.userName);
      System.out.println("-".repeat(user.userName.length() * 2));
      System.out.println(user);
      System.out.println();
    }
    System.out.println("Total Inserts: "+ users.usersDB.getInserts());
    System.out.println("Total Eliminations: "+ users.usersDB.getEliminations());
  }
}
