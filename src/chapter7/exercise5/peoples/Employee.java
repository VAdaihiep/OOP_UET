package chapter7.exercise5.peoples;

public class Employee extends Person {
  private double salary;

  public Employee(String name, String birthDay, double salary) {
	super(name, birthDay);
	this.salary = salary;
  }

  public double getSalary() {
	return salary;
  }

  @Override
  public String toString() {
	return super.toString() + "Luong cua nguoi nay la: " + getSalary();
  }
}
