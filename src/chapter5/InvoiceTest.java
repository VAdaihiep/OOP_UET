package chapter5;

class Invoice {
  String partNumber;
  String partDescription;
  int quantity;
  double unitPrice;

  public Invoice(String partNumber, String partDescription, int quantity, double unitPrice) {
	this.partNumber = partNumber;
	this.partDescription = partDescription;
	this.quantity = quantity;
	this.unitPrice = unitPrice;
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
	return Math.max(unitPrice, 0.0);
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
	printInvoice(durex.getPartNumber(), durex.getPartDescription(), durex.getQuantity(), durex.getUnitPrice(), durex.getInvoiceAmount());

	Invoice sagami = new Invoice("96", "Sagami Xtreme Green", -1, -15.0);
	printInvoice(sagami.getPartNumber(), sagami.getPartDescription(), sagami.getQuantity(), sagami.getUnitPrice(), sagami.getInvoiceAmount());

  }

  private static void printInvoice(String partNumber, String partDescription,
								   int quantity, double unitPrice, double total) {
	/*
	Using String Format
	%s : sẽ in chuỗi tham số đầu vào.
	%d : sẽ in số nguyên như tham số đầu vào.
	%.2f : hiển thị tối đa x chữ số thập phân của số.
	 */
	System.out.printf("%s: %s - %d * %.2f = %.2f\n", partNumber, partDescription, quantity, unitPrice, total);
  }
}
