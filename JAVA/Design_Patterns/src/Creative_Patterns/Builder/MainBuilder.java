package Creative_Patterns.Builder;

public class MainBuilder {
  public static void main(String[] args) {
    Vehicle car = new CarBuilder("Mazda")
            .setModel("2023")
            .setMotor("Electric")
            .setDoors(4)
            .build();
    System.out.println("Brand: "+ car.getBrand());
    System.out.println("Doors: "+ car.getDoors());
    System.out.println("Model: "+ car.getModel());
    System.out.println("Motor: "+ car.getMotor());
  }
}
