package com.poo.clases;

import com.poo.inheritance.Car;
import com.poo.inheritance.Motorcycle;
import com.poo.inheritance.Truck;

public class ClassMain {
  public static void main(String[] args) {

    // Class and objects
    Vehicle toyotaPrius = new Vehicle();
    Motor motorGTI = new Motor("GTI", 190, 420.9,6);

    Vehicle fordMondeos = new Vehicle("Ford","Mondeos", 100, 2020, true, motorGTI);
    System.out.println(fordMondeos.manufacturer);
    System.out.println(fordMondeos.model);
    System.out.println(fordMondeos.speed);
    fordMondeos.aceleration(100);
    System.out.println(fordMondeos.speed);

    //2. Inheritance
    Motorcycle kawasakiNinja = new Motorcycle();
    kawasakiNinja.setManufacturer("kawasaki");

    System.out.println(kawasakiNinja);

    //3. Polymorphism
    Vehicle vehicle;

    vehicle = new Car();
    vehicle.aceleration(200);
    System.out.println(vehicle.speed);

    vehicle = new Motorcycle();
    vehicle.aceleration(79);
    System.out.println(vehicle.speed);

    vehicle = new Truck();
    vehicle.aceleration(120);
    System.out.println(vehicle.speed);

    //4. Class abstract: Can't be instantiated, only child classes are instantiated




  }
}
