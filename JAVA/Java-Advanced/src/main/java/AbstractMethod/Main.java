package AbstractMethod;

public class Main {
  public static void main(String[] args) {
    ElectricalInvoiceBusiness business = new ElectricalInvoiceBusiness();
    System.out.println(business.CalculateTax(10));

    ElectricalInvoiceUser user = new ElectricalInvoiceUser();
    System.out.println(user.CalculateTax(188));
  }
}
