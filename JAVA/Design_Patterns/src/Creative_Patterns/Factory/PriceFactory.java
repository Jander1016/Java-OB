package Creative_Patterns.Factory;

public class PriceFactory {

  Price price;
  private PriceFactory() { };

  public PriceFactory(String country) {
    if (country.equalsIgnoreCase("Spain")) {
      price = new PriceEUR();
      System.out.println(country +", price in EUR: "+ price.getPrice());

    } else if (country.equalsIgnoreCase("UK") ){
      price= new PriceGBP();
      System.out.println(country +", price in GBP: "+ price.getPrice());

    }else {

      price = new PriceUSD();
      System.out.println(country +", price in USD: " + price.getPrice());
    }
  }

  public double getPrice() {
    return price.getPrice();
  }
}
