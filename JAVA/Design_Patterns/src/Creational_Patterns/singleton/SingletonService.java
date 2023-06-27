package Creational_Patterns.singleton;

public class SingletonService {
  private static SingletonService instance;

  private SingletonService() {}

  public static SingletonService getSingletonService() {
    if (instance == null) {
      instance = new SingletonService();
    }
    return instance;
  }
}
