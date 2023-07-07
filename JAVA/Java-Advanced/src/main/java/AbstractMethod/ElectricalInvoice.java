package AbstractMethod;

abstract public class ElectricalInvoice {
  public double getTax(double price, double tax) {
    return price * tax/100;
  }

  public abstract double CalculateTax(int units);
}
