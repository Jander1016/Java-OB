package Creational_Patterns.Factory;

public class MainFactory {
  public static void main(String[] args) {
    PriceFactory price1 = new PriceFactory("Spain");
    System.out.println(price1.getPrice());

    PriceFactory price2 = new PriceFactory("Peru");
    System.out.println(price2.getPrice());

    PriceFactory price3 = new PriceFactory("UK");
    System.out.println(price3.getPrice());
  }
}
