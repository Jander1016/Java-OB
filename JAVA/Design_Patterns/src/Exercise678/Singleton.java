package Exercise678;

public class Singleton {
  public static Singleton connectDB;

  private Singleton() {  }

  public static Singleton getConnectDB() {
    if(connectDB == null) {
      connectDB = new Singleton();
    }
    return connectDB;
  }

}
