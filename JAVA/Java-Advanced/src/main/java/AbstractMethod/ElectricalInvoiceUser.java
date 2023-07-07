package AbstractMethod;

public class ElectricalInvoiceUser extends ElectricalInvoice{
  @Override
  public double CalculateTax(int units) {
    return units * getTax(102,7);
  }
}
