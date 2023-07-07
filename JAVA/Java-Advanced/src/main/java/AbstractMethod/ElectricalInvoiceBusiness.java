package AbstractMethod;

public class ElectricalInvoiceBusiness extends ElectricalInvoice{
  @Override
  public double CalculateTax(int units) {
    return units * getTax(284,21);
  }
}
