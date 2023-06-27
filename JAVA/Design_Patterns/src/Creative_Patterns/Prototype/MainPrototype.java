package Creative_Patterns.Prototype;

public class MainPrototype {
  public static void main(String[] args) {
    Car newCar = new Car();
    newCar.brand = "Fiat";
    newCar.model ="Coupe";
    newCar.doors = 4;

    System.out.println(newCar.brand +" / "+ newCar.model+"/ "+ newCar.doors);

    try {
      Car newCarClone = newCar.cloneCar();
      newCarClone.brand = "Toyota";
      System.out.println(newCarClone.brand +" / "+ newCarClone.model+"/ "+ newCarClone.doors);
    }catch (CloneNotSupportedException e){
      e.getMessage();
    }

  }
}
