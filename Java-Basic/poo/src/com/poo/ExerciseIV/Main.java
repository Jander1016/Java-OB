package com.poo.ExerciseIV;

public class Main {
  public static void main(String[] args) {
    SmartDevice iphone11= new SmartPhone("iphone 11 64GB"," 64GB de almacenamiento interno y 4 gb de ram",1199.99,5.1);
    SmartDevice appleWatch= new SmartWatch("watch 2022"," agenda, llamadas, app de salud",900,"modelo 2022");
    System.out.println(iphone11.description);
    System.out.println(appleWatch.description);

  }
}
