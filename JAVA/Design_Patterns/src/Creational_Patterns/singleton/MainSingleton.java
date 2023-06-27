package Creational_Patterns.singleton;

public class MainSingleton {
  public static void main(String[] args) {
    SingletonService service = SingletonService.getSingletonService();
    SingletonService service2 = SingletonService.getSingletonService();

    System.out.println(service);
    System.out.println(service2);
  }
}
