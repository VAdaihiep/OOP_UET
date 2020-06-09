package chapter5;

class Employee {
  private String first_name;
  private String last_name;
  private double salary;

  public Employee(String first_name, String last_name, double salary) {
	this.first_name = first_name;
	this.last_name = last_name;
	this.salary = salary;
  }

  public String getFirst_name() {
	return first_name;
  }

  public void setFirst_name(String first_name) {
	this.first_name = first_name;
  }

  public String getLast_name() {
	return last_name;
  }

  public void setLast_name(String last_name) {
	this.last_name = last_name;
  }

  public double getSalary() {
	return salary;
  }

  public void setSalary(double salary) {
	this.salary = salary;
  }
}

public class EmployeeTest {
  public static void main(String[] args) {
	Employee employee1 = new Employee("Hai", "Nguyen", 45);
	Employee employee2 = new Employee("Hana", "Hoang", -3);

	if (employee1.getSalary() < 0) employee1.setSalary(0.0);
	if (employee2.getSalary() < 0) employee2.setSalary(0.0);

	System.out.println("Employee1: Total salary of year is: " + employee1.getSalary());
	System.out.println("Employee2: Total salary of year is: " + employee2.getSalary());
	employee1.setSalary(employee1.getSalary() * 1.1);
	employee2.setSalary(employee2.getSalary() * 1.1);
	System.out.println("Employee1 after change: Total salary of year is: " + employee1.getSalary());
	System.out.println("Employee2 after change: Total salary of year is: " + employee2.getSalary());
  }
}
