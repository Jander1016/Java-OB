package DTO;

public class MainDto {
  public static void main(String[] args) {
    User user1 = new User("Jaimito");
    user1.addVehicle(new Vehicle("Car"));

    User user2 = new User("Lucia");
    user2.addVehicle(new Vehicle("Car"));
    user2.addVehicle(new Vehicle("Moto"));
    user2.addVehicle(new Vehicle("Airplane"));

    Users listUser = new Users();
    listUser.addUser(user1);
    listUser.addUser(user2);

    for (User user : listUser.users) {
      System.out.println(user.getUserName());
    }

    User userInfo= listUser.getUsers(user2.getUserName());

    for (Vehicle vehicle : userInfo.vehicle){
      System.out.println("User "+ userInfo.getUserName() + ": " + vehicle.getType());
    }

  }
}
