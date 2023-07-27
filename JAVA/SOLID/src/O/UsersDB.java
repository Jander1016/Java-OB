package O;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsersDB {
  public String fileData= "users.txt";

  public ArrayList<User> convertedUsersFileToArrayList(){
    ArrayList<User> users = new ArrayList<>();

    try {
      Scanner scanner = new Scanner(new File(fileData));

      while (scanner.hasNext()){
        String actualUser = scanner.next();
        String[] partsUser = actualUser.split(",");

        User user = new User();
        user.userName = partsUser[0];
        user.name = partsUser[1];
        user.lastName = partsUser[2];
        user.email = partsUser[3];
        user.accessLevel = Integer.parseInt(partsUser[4]);
        users.add(user);
      }

      scanner.close();

    }catch (Exception e){
      System.out.println(e.getMessage());
    }
    return users;
  }

  private String separateUsersByComma(User user){
    return user.userName + ","
        + user.name + ","
        + user.lastName + ","
        + user.email + ","
        + user.accessLevel ;
  }

  public User find(User user) {
    ArrayList<User> users = convertedUsersFileToArrayList();

    for (User actualUser: users) {
      if (actualUser.name.equalsIgnoreCase(user.userName)) return actualUser;
    }
    return null;
  }

  public void insert(User user) {
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(fileData,true);
      PrintStream printStream = new PrintStream(fileOutputStream);
      printStream.println(separateUsersByComma(user));
      printStream.flush();
      printStream.close();

    }catch (Exception e){
      System.out.println(e.getMessage());
    }
  }

  public void delete(User user) {
    ArrayList<User> users = convertedUsersFileToArrayList();

    for(int i=0; i < users.size(); i++) {
      if(users.get(i).userName.equalsIgnoreCase(user.userName)) users.remove(i);
    }

    try {
      PrintStream printStream = new PrintStream(fileData);
      for (User actualUser : users) {
        String userByComma = separateUsersByComma(actualUser);
        printStream.println(userByComma);
      }
      printStream.flush();
      printStream.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());;
    }
  }
}
