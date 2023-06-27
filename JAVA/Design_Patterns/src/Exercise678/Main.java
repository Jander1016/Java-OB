package Exercise678;

public class Main {
  public static void main(String[] args) {
    Singleton connectWindows = Singleton.getConnectDB();
    Singleton connectLinux = Singleton.getConnectDB();

    System.out.println(connectWindows);
    System.out.println(connectLinux);
  }
}
