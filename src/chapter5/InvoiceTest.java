package chapter5;

class Invoice {
  private String partNumber;
  private String partDescription;
  private int quantity;
  private double unitPrice;

  public Invoice(String partNumber, String partDescription, int quantity, double unitPrice) {
	this.partNumber = partNumber;
	this.partDescription = partDescription;
	this.quantity = Math.max(quantity, 0);
	this.unitPrice = Math.max(unitPrice, 0.0);
  }

  public String getPartNumber() {
	return partNumber;
  }

  public void setPartNumber(String partNumber) {
	this.partNumber = partNumber;
  }

  public String getPartDescription() {
	return partDescription;
  }

  public void setPartDescription(String partDescription) {
	this.partDescription = partDescription;
  }

  public int getQuantity() {
	return Math.max(quantity, 0);
  }

  public void setQuantity(int quantity) {
	this.quantity = quantity;
  }

  public double getUnitPrice() {
	return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
  }

  public double getInvoiceAmount() {
	return getQuantity() * getUnitPrice();
  }
}

public class InvoiceTest {
  public static void main(String[] args) {
	Invoice durex = new Invoice("69", "Durex Invisible Extra Thin", 15, 12.5);
	Invoice sagami = new Invoice("96", "Sagami Xtreme Green", -1, -15.0);

	printInvoice(durex);
	printInvoice(sagami);
  }

  private static void printInvoice(Invoice invoice) {
	/*
	Using String Format
	%s : sẽ in chuỗi tham số đầu vào.
	%d : sẽ in số nguyên như tham số đầu vào.
	%.2f : hiển thị tối đa x chữ số thập phân của số.
	 */
	System.out.printf("%s - %d = %.2f\n", invoice.getPartDescription(), invoice.getQuantity(), invoice.getUnitPrice());
  }
}
