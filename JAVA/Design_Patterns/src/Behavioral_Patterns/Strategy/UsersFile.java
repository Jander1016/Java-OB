package Behavioral_Patterns.Strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsersFile implements Users{
    private final String usersFile = "users.txt";
    private PrintStream file;

  public UsersFile() {
    try{
      file = new PrintStream(usersFile);
    }catch(Exception e){
      System.out.println("Can't open: " + e.getMessage());
    }
  }

  @Override
  public void create(String userName) {
    file.println(userName);
  }

  @Override
  public ArrayList<String> listUsers() {
    ArrayList<String> usersList = new ArrayList<>();
    try {
      Scanner scanner = new Scanner(new File(usersFile));

      while (scanner.hasNext()) {
        usersList.add(scanner.next());
      }
      scanner.close();
    }catch (Exception e) {
      System.out.println("Error reading: " + e.getMessage());
    }
    return usersList;
  }
}
